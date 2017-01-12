/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.action;

/**
 *
 * @author xy
 */
import com.gwac.dao.FitsFileCutDAO;
import com.gwac.dao.ObjectIdentityDao;
import com.gwac.dao.ObjectTypeDao;
import com.gwac.model.ObjectIdentity;
import com.gwac.model.ObjectType;
import com.gwac.util.CommonFunction;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ApplicationAware;

/*parameter：currentDirectory, configFile, [fileUpload], [fileUpload].*/
/* wget command example: */
/* wget http://190.168.1.25/getCutImageList.action?cameraName=M01 -O aa.list*/
/**
 * @author xy
 */
//@InterceptorRef("jsonValidationWorkflowStack")
//加了这句化，文件传不上来
public class GetCutImageList extends ActionSupport implements ApplicationAware {

  private static final Log log = LogFactory.getLog(GetCutImageList.class);
  private String cameraName;
  private FitsFileCutDAO ffcDao;
  private InputStream fileInputStream;
  private String fileName;
  private String rootWebDir;
  private String echo = "";

  private ObjectIdentityDao objIdtyDao;
  private ObjectTypeDao objTypeDao;
  private Map<String, Object> appMap = null;

  @Action(value = "getCutImageList", results = {
    @Result(location = "forward.jsp", name = SUCCESS),
    @Result(location = "forward.jsp", name = INPUT),
    @Result(location = "forward.jsp", name = ERROR)})
  public String upload() {

    boolean flag = true;
    String result = SUCCESS;
    echo = "";

    //必须设置传输机器名称
    if (null == cameraName || cameraName.isEmpty()) {
      echo = echo + "Must set machine name(cameraName).\n";
      flag = false;
    }

    if (flag) {
      String rootPath = getText("gwac.data.root.directory");
      String destPath = rootPath;
      if (destPath.charAt(destPath.length() - 1) != '/') {
        destPath += "/tmp/";
      } else {
        destPath += "tmp/";
      }
      File tmpDir = new File(destPath);
      if (!tmpDir.exists()) {
        tmpDir.mkdirs();
        log.debug("create dir " + tmpDir);
      }

      ObjectType cameraType = (ObjectType) appMap.get("camera");
      if (cameraType == null) {
        cameraType = objTypeDao.getByName("camera");
        appMap.put("camera", cameraType);
      }

      cameraName = cameraName.trim();
      ObjectIdentity objId = objIdtyDao.getByName(cameraType, cameraName);
      String content = ffcDao.getUnCuttedStarList(objId.getObjId(), 6, Short.MAX_VALUE); //Short.MAX_VALUE, 最初取值为6，即最多只裁剪优先级编号小于6的切图
      try {
        if (!content.isEmpty()) {
          fileName = cameraName + "_" + CommonFunction.getCurDateTimeString() + ".lst";
          File file = new File(destPath, fileName);
          if (!file.exists()) {
            file.createNewFile();
            log.debug("create cut image list file " + file);
          }
          FileWriter fw = new FileWriter(file.getAbsoluteFile());
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write(content);
          bw.close();
        } else {
          fileName = "empty.lst";
          File file = new File(destPath, fileName);
          if (!file.exists()) {
            file.createNewFile();
            log.debug("create empty file " + file);
          }
//          log.debug("no cut images found at this time.");
        }
      } catch (IOException ex) {
        log.error("create or write file error ", ex);
      }
    } else {
      result = ERROR;
    }
    ActionContext ctx = ActionContext.getContext();
    ctx.getSession().put("echo", echo);
    ctx.getSession().put("fileName", rootWebDir + "/tmp/" + fileName);
    return result;
  }

  public String display() {
    return NONE;
  }

  public InputStream getFileInputStream() {
    return fileInputStream;
  }

  /**
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * @param ffcDao the ffcDao to set
   */
  public void setFfcDao(FitsFileCutDAO ffcDao) {
    this.ffcDao = ffcDao;
  }

  /**
   * @param rootWebDir the rootWebDir to set
   */
  public void setRootWebDir(String rootWebDir) {
    this.rootWebDir = rootWebDir;
  }

  /**
   * @param cameraName the cameraName to set
   */
  public void setCameraName(String cameraName) {
    this.cameraName = cameraName;
  }

  /**
   * @param objIdtyDao the objIdtyDao to set
   */
  public void setObjIdtyDao(ObjectIdentityDao objIdtyDao) {
    this.objIdtyDao = objIdtyDao;
  }

  /**
   * @param objTypeDao the objTypeDao to set
   */
  public void setObjTypeDao(ObjectTypeDao objTypeDao) {
    this.objTypeDao = objTypeDao;
  }

  @Override
  public void setApplication(Map<String, Object> map) {
    this.appMap = map;
  }
}
