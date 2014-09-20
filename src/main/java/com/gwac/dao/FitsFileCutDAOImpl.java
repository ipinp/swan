/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.dao;

import com.gwac.model.FitsFileCut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author xy
 */
public class FitsFileCutDAOImpl extends BaseHibernateDaoImpl<FitsFileCut> implements FitsFileCutDAO {

  public void moveDataToHisTable() {

    Session session = getCurrentSession();
    String sql = "WITH moved_rows AS ( DELETE FROM fits_file_cut RETURNING * ) INSERT INTO fits_file_cut_his SELECT * FROM moved_rows;";
    session.createSQLQuery(sql).executeUpdate();
  }

  public List<FitsFileCut> getUnCutImageByOtId(long otId, int lastCuttedId) {

    Session session = getCurrentSession();
    String sql = "select * from fits_file_cut where ot_id=" + otId + " and number>=" + lastCuttedId + " order by number asc";
    Query q = session.createSQLQuery(sql).addEntity(FitsFileCut.class);
    return q.list();
  }

  public void uploadSuccessCutByName(String fileName) {

    Session session = getCurrentSession();
    String sql = "update fits_file_cut set success_cut=true where file_name='" + fileName + "'";
    session.createSQLQuery(sql).executeUpdate();
  }

  public String getUnCuttedStarList(int dpmId) {
    Session session = getCurrentSession();
    String sql = "select ff.file_name ffname, ffc.img_x, ffc.img_y, ffc.file_name ffcname "
            + " from fits_file_cut ffc "
            + " inner join fits_file ff on ffc.ff_id=ff.ff_id "
            + " where ffc.request_cut=false and ffc.dpm_id=" + dpmId;
    Query q = session.createSQLQuery(sql);
    Iterator itor = q.list().iterator();

    StringBuilder rst = new StringBuilder();
    while (itor.hasNext()) {
      Object[] row = (Object[]) itor.next();
      try {
        rst.append(row[0]);
        rst.append(" ");
        rst.append(row[1]);
        rst.append(" ");
        rst.append(row[2]);
        rst.append(" ");
        rst.append(row[3]);
        rst.append("\n");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    sql = "update fits_file_cut set request_cut=true where request_cut=false and dpm_id=" + dpmId;
    session.createSQLQuery(sql).executeUpdate();
    return rst.toString();
  }

  /**
   * 通过OT名称，查询该OT所有的切图
   *
   * @param otName
   * @return OT切图路径和名称Map
   */
  public List<FitsFileCut> getCutImageByOtName(String otName) {

    List<FitsFileCut> objs = new ArrayList<FitsFileCut>();
    Session session = getCurrentSession();
//    String sql = "select ffc.store_path, ffc.file_name, ffc.number "
//	    + "from fits_file_cut ffc "
//	    + "where ffc.ot_id=(select ot_id from ot_level2 ob where ob.name='" + otName + "') "
//	    + "order by ffc.number;";
    String sql = "select * "
            + "from fits_file_cut ffc "
            + "where ffc.success_cut=true and ffc.ot_id=(select ot_id from ot_level2 ob where ob.name='" + otName + "') "
            + "order by ffc.number;";
    Query q = session.createSQLQuery(sql).addEntity(FitsFileCut.class);
    List rstList = q.list();
//    for (int i = 0; i < rstList.size(); i++) {
//      Object[] row = (Object[]) rstList.get(i);
//      try {
//	FitsFileCut obj = new FitsFileCut();
//	obj.setStorePath((String) row[0]);
//	obj.setFileName((String) row[1]);
//	obj.setNumber((Integer) row[2]);
//	objs.add(obj);
//      } catch (ClassCastException cce) {
//	cce.printStackTrace();
//      }
//    }
    return rstList;
  }
}
