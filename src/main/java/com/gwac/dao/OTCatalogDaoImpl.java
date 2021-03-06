/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.FollowUpCatalog;
import com.gwac.model.OTCatalog;
import com.gwac.util.CommonFunction;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author xy
 */
public class OTCatalogDaoImpl implements OTCatalogDao {

  private static final Log log = LogFactory.getLog(OTCatalogDaoImpl.class);

  @Override
  public List<FollowUpCatalog> getFollowUpCatalog(String path) {
    BufferedReader br = null;
    String line;
    String splitBy = " +";  //正则表达式一到多个空格
    List<FollowUpCatalog> objs = new ArrayList<>();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    try {
      File tfile = new File(path);
      if (tfile.exists()) {
        br = new BufferedReader(new FileReader(tfile));
        while ((line = br.readLine()) != null) {
          if (line.charAt(0) == '#') {
            continue;
          }
          String[] strs = line.split(splitBy);
          FollowUpCatalog obj = new FollowUpCatalog();
          obj.setJd(Float.parseFloat(strs[0]));
          obj.setDateUt(df.parse(strs[1].replace('T', ' ')));
          obj.setFilter(strs[2]);
          obj.setRa(Float.parseFloat(strs[3]));
          obj.setDec(Float.parseFloat(strs[4]));
          obj.setX(Float.parseFloat(strs[5]));
          obj.setY(Float.parseFloat(strs[6]));
          obj.setMagClbtUsno(Float.parseFloat(strs[7]));
          obj.setMagErr(Float.parseFloat(strs[8]));
          obj.setEllipticity(Float.parseFloat(strs[9]));
          obj.setClassStar(Float.parseFloat(strs[10]));
          obj.setFwhm(Float.parseFloat(strs[11]));
          obj.setFlag(Short.parseShort(strs[12]));
          obj.setB2(Float.parseFloat(strs[13]));
          obj.setR2(Float.parseFloat(strs[14]));
          obj.setI(Float.parseFloat(strs[15]));
          obj.setOtType(strs[16]);
          obj.setFfName(strs[17]);
          obj.setObjLabel(Short.parseShort(strs[18]));
          objs.add(obj);
        }
      } else {
        log.error("file not exist " + tfile);
      }
    } catch (FileNotFoundException e) {
      log.error("parse file error:"+path, e);
    } catch (IOException e) {
      log.error("parse file error:"+path, e);
    } catch (ParseException e) {
      log.error("parse file error:"+path, e);
    } catch (Exception e) {
      log.error("parse file error:"+path, e);
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          log.error(e);
        }
      }
    }
    return objs;
  }

  @Override
  public List<OTCatalog> getOT1Catalog(String path) {
    BufferedReader br = null;
    String line = "";
    String splitBy = " +";
    List<OTCatalog> otList = new ArrayList<OTCatalog>();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    try {
      File tfile = new File(path);
      if (!tfile.exists()) {
        log.error("file not exist " + tfile);
        return otList;
      }
      br = new BufferedReader(new FileReader(tfile));
      while ((line = br.readLine()) != null) {
        if (line.charAt(0) == '#') {
          continue;
        }
        // split on comma(',')  
        String[] strs = line.split(splitBy);
        // create car object to store values  
        OTCatalog ot = new OTCatalog();

        // add values from csv to car object  
        ot.setRaD(Float.parseFloat(strs[0]));
        ot.setDecD(Float.parseFloat(strs[1]));
        ot.setX(Float.parseFloat(strs[2]));
        ot.setY(Float.parseFloat(strs[3]));
        ot.setXTemp(Float.parseFloat(strs[4]));
        ot.setYTemp(Float.parseFloat(strs[5]));
        ot.setDateUt(df.parse(strs[6].replace('T', ' ')));
        ot.setImageName(strs[7]);
        ot.setFlux(Float.parseFloat(strs[8]));
        ot.setFlag(Boolean.parseBoolean(strs[9]));
//        ot.setFlagChb(Float.parseFloat(strs[10]));
        ot.setBackground(Float.parseFloat(strs[10]));
        ot.setThreshold(Float.parseFloat(strs[11]));
        ot.setMagAper(Float.parseFloat(strs[12]));
        ot.setMagerrAper(Float.parseFloat(strs[13]));
        ot.setEllipticity(Float.parseFloat(strs[14]));
        ot.setClassStar(Float.parseFloat(strs[15]));
//        ot.setOtFlag(Boolean.parseBoolean(strs[17]));

        otList.add(ot);
      }

    } catch (FileNotFoundException e) {
      log.error("parse file error:"+path, e);
    } catch (IOException e) {
      log.error("parse file error:"+path, e);
    } catch (ParseException e) {
      log.error("parse file error:"+path, e);
    } catch (Exception e) {
      log.error("parse file error:"+path, e);
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          log.error(e);
        }
      }
    }
    return otList;
  }

  @Override
  public List<OTCatalog> getOT1VarCatalog(String path) {
    BufferedReader br = null;
    String line = "";
    String splitBy = " +";
    List<OTCatalog> otList = new ArrayList<OTCatalog>();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    try {
      File tfile = new File(path);
      if (!tfile.exists()) {
        log.error("file not exist " + tfile);
        return otList;
      }
      br = new BufferedReader(new FileReader(tfile));
      while ((line = br.readLine()) != null) {
        if (line.charAt(0) == '#') {
          continue;
        }
        // split on comma(',')  
        String[] strs = line.split(splitBy);
        // create car object to store values  
        OTCatalog ot = new OTCatalog();

        // add values from csv to car object  
        ot.setRaD(Float.parseFloat(strs[0]));
        ot.setDecD(Float.parseFloat(strs[1]));
        ot.setX(Float.parseFloat(strs[2]));
        ot.setY(Float.parseFloat(strs[3]));
        ot.setXTemp(Float.parseFloat(strs[4]));
        ot.setYTemp(Float.parseFloat(strs[5]));
        ot.setDateUt(df.parse(strs[6].replace('T', ' ')));
        ot.setImageName(strs[7]);
        ot.setFlux(Float.parseFloat(strs[8]));
        ot.setFlag(Boolean.parseBoolean(strs[9]));
        ot.setBackground(Float.parseFloat(strs[10]));
        ot.setThreshold(Float.parseFloat(strs[11]));
        ot.setMagAper(Float.parseFloat(strs[12]));
        ot.setMagerrAper(Float.parseFloat(strs[13]));
        ot.setEllipticity(Float.parseFloat(strs[14]));
        ot.setClassStar(Float.parseFloat(strs[15]));
        ot.setDistance(Float.parseFloat(strs[16]));
        ot.setDeltamag(Float.parseFloat(strs[17]));

        otList.add(ot);
      }

    } catch (FileNotFoundException e) {
      log.error("parse file error:"+path, e);
    } catch (IOException e) {
      log.error("parse file error:"+path, e);
    } catch (ParseException e) {
      log.error("parse file error:"+path, e);
    } catch (Exception e) {
      log.error("parse file error:"+path, e);
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          log.error(e);
        }
      }
    }
    return otList;
  }

  @Override
  public List<OTCatalog> getOT1CutCatalog(String path) {
    BufferedReader br = null;
    String line = "";
    String splitBy = " +";
    List<OTCatalog> otList = new ArrayList<>();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    try {
      File tfile = new File(path);
      if (!tfile.exists()) {
        log.error("file not exist " + tfile);
        return otList;
      }
      br = new BufferedReader(new FileReader(tfile));
      //- JD  X_IMAGE  Y_IMAGE  MAG_APER  MAGERR_APER  Ra  Dec  tag  fitsname UTC cutImageName
      while ((line = br.readLine()) != null) {
        if (line.charAt(0) == '#') {
          continue;
        }
        // split on comma(',')  
        String[] strs = line.split(splitBy);
        // create car object to store values  
        OTCatalog ot = new OTCatalog();

        // add values from csv to car object  
        ot.setX(Float.parseFloat(strs[1]));
        ot.setY(Float.parseFloat(strs[2]));
        ot.setMagAper(Float.parseFloat(strs[3]));
        ot.setMagerrAper(Float.parseFloat(strs[4]));
        if (strs[5].contains(":")) {
          ot.setRaD(CommonFunction.hmsToDegree(strs[5]));
        } else {
          ot.setRaD(Float.parseFloat(strs[5]));
        }
        if (strs[6].contains(":")) {
          ot.setDecD(CommonFunction.dmsToDegree(strs[6]));
        } else {
          ot.setDecD(Float.parseFloat(strs[6]));
        }
        ot.setImageName(strs[8]); //7=tag
        ot.setDateUt(df.parse(strs[9].replace('T', ' ')));
        if (strs.length == 11) {
          ot.setCutImageName(strs[10]);
        }

        otList.add(ot);
      }

    } catch (FileNotFoundException e) {
      log.error("parse file error:"+path, e);
    } catch (IOException e) {
      log.error("parse file error:"+path, e);
    } catch (ParseException e) {
      log.error("parse file error:"+path, e);
    } catch (Exception e) {
      log.error("parse file error:"+path, e);
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          log.error(e);
        }
      }
    }
    return otList;
  }
}
