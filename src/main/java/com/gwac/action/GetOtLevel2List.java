package com.gwac.action;

import com.gwac.dao.OtLevel2Dao;
import com.gwac.model.OtLevel2;
import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

@Result(name = "success", type = "json")
public class GetOtLevel2List extends ActionSupport implements SessionAware {

  private static final long serialVersionUID = 5073694279068543593L;
  private static final Log log = LogFactory.getLog(GetOtLevel2List.class);
  // Your result List
  private List<OtLevel2> gridModel;
  // get how many rows we want to have into the grid - rowNum attribute in the
  // grid
  private Integer rows = 0;
  // Get the requested page. By default grid sets this to 1.
  private Integer page = 0;
  // sorting order - asc or desc
  private String sord;
  // get index row - i.e. user click to sort.
  private String sidx;
  // Search Field
  private String searchField;
  // The Search String
  private String searchString;
  // Limit the result when using local data, value form attribute rowTotal
  private Integer totalrows;
  // he Search Operation
  // ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
  private String searchOper;
  // Your Total Pages
  private Integer total = 0;
  // All Records
  private Integer records = 0;
  private boolean loadonce = false;
  private Map<String, Object> session;
  private OtLevel2Dao obDao = null;
  private String startDate;
  private String endDate;
  private float xtemp;
  private float ytemp;
  private String telscope;
  private float searchRadius;

  @SuppressWarnings("unchecked")
//  @Transactional(readOnly=true)
  public String execute() {

    // Calucalate until rows ware selected
    int to = (rows * page);
    // Calculate the first row to read
    int from = to - rows;

    if (startDate.isEmpty() && endDate.isEmpty() && telscope.equalsIgnoreCase("all")
            && xtemp == 0.0 && ytemp == 0.0) {

      String[] orderNames = {"foundTimeUtc", "name"};
      int[] sorts = {2, 2};
      gridModel = obDao.findRecord(from, rows, orderNames, sorts);

    } else {
      gridModel = obDao.queryOtLevel2(startDate, endDate, telscope, xtemp, ytemp, searchRadius, from, rows);
    }

    Number tn = obDao.count();
    if (tn != null) {
      records = tn.intValue();
    } else {
      records = 0;
    };
    
    if (totalrows != null) {
      records = totalrows;
    }

    // Set to = max rows
    if (to > records) {
      to = records;
    }

    // Calculate total Pages
    total = (int) Math.ceil((double) records / (double) rows);

    return SUCCESS;
  }

  /**
   * @return how many rows we want to have into the grid
   */
  public Integer getRows() {
    return rows;
  }

  /**
   * @param rows how many rows we want to have into the grid
   */
  public void setRows(Integer rows) {
    this.rows = rows;
  }

  /**
   * @return current page of the query
   */
  public Integer getPage() {
    return page;
  }

  /**
   * @param page current page of the query
   */
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * @return total pages for the query
   */
  public Integer getTotal() {
    return total;
  }

  /**
   * @param total total pages for the query
   */
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * @return total number of records for the query. e.g. select count(*) from
   * table
   */
  public Integer getRecords() {
    return records;
  }

  /**
   * @param records total number of records for the query. e.g. select count(*)
   * from table
   */
  public void setRecords(Integer records) {

    this.records = records;

    if (this.records > 0 && this.rows > 0) {
      this.total = (int) Math.ceil((double) this.records
              / (double) this.rows);
    } else {
      this.total = 0;
    }
  }

  /**
   * @return an collection that contains the actual data
   */
  public List<OtLevel2> getGridModel() {
    return gridModel;
  }

  /**
   * @param gridModel an collection that contains the actual data
   */
  public void setGridModel(List<OtLevel2> gridModel) {
    this.gridModel = gridModel;
  }

  /**
   * @return sorting order
   */
  public String getSord() {
    return sord;
  }

  /**
   * @param sord sorting order
   */
  public void setSord(String sord) {
    this.sord = sord;
  }

  /**
   * @return get index row - i.e. user click to sort.
   */
  public String getSidx() {
    return sidx;
  }

  /**
   * @param sidx get index row - i.e. user click to sort.
   */
  public void setSidx(String sidx) {
    this.sidx = sidx;
  }

  public void setSearchField(String searchField) {
    this.searchField = searchField;
  }

  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

  public void setSearchOper(String searchOper) {
    this.searchOper = searchOper;
  }

  public void setTotalrows(Integer totalrows) {
    this.totalrows = totalrows;
  }

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  /**
   * @param obDao the obDao to set
   */
  public void setObDao(OtLevel2Dao obDao) {
    this.obDao = obDao;
  }

  /**
   * @return the startDate
   */
  public String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate the startDate to set
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * @return the endDate
   */
  public String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate the endDate to set
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * @return the telscope
   */
  public String getTelscope() {
    return telscope;
  }

  /**
   * @param telscope the telscope to set
   */
  public void setTelscope(String telscope) {
    this.telscope = telscope;
  }

  /**
   * @return the searchRadius
   */
  public float getSearchRadius() {
    return searchRadius;
  }

  /**
   * @param searchRadius the searchRadius to set
   */
  public void setSearchRadius(float searchRadius) {
    this.searchRadius = searchRadius;
  }

  /**
   * @return the xtemp
   */
  public float getXtemp() {
    return xtemp;
  }

  /**
   * @param xtemp the xtemp to set
   */
  public void setXtemp(float xtemp) {
    this.xtemp = xtemp;
  }

  /**
   * @return the ytemp
   */
  public float getYtemp() {
    return ytemp;
  }

  /**
   * @param ytemp the ytemp to set
   */
  public void setYtemp(float ytemp) {
    this.ytemp = ytemp;
  }
}
