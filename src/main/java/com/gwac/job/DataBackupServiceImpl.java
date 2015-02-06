/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gwac.job;

import com.gwac.dao.ConfigFileDao;
import com.gwac.dao.FitsFileCutDAO;
import com.gwac.dao.OtLevel2Dao;
import com.gwac.dao.OtObserveRecordDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 数据转移，清空需要频繁查询的表，这些表只存储当天的最新数据，之后将表中数据移动到历史表
 * @author xy
 */
public class DataBackupServiceImpl implements DataBackupService{
  
  private static final Log log = LogFactory.getLog(DataBackupServiceImpl.class);
  
  private static boolean running = true;
  private Boolean isBeiJingServer;
  private Boolean isTestServer;
  
  private OtLevel2Dao otlv2Dao;
  private FitsFileCutDAO ffcDao;
  private OtObserveRecordDAO oorDao;
  private ConfigFileDao cfDao;
  
  public void startJob(){
    
    if(isTestServer){
      return;
    }
    
    if (running == true) {
      log.debug("start job...");
      running = false;
    } else {
      log.warn("job is running, jump this scheduler.");
      return;
    }
    
    long startTime=System.nanoTime();
    otlv2Dao.moveDataToHisTable();
    ffcDao.moveDataToHisTable();
    oorDao.moveDataToHisTable();
    cfDao.moveDataToHisTable();
    long endTime=System.nanoTime();
    
    if (running == false) {
      running = true;
      log.debug("job is done.");
    }
    log.debug("job consume "+ 1.0*(endTime-startTime)/1e9+" seconds.");
  }

  /**
   * @param otlv2Dao the otlv2Dao to set
   */
  public void setOtlv2Dao(OtLevel2Dao otlv2Dao) {
    this.otlv2Dao = otlv2Dao;
  }

  /**
   * @param ffcDao the ffcDao to set
   */
  public void setFfcDao(FitsFileCutDAO ffcDao) {
    this.ffcDao = ffcDao;
  }

  /**
   * @param oorDao the oorDao to set
   */
  public void setOorDao(OtObserveRecordDAO oorDao) {
    this.oorDao = oorDao;
  }

  /**
   * @return the cfDao
   */
  public ConfigFileDao getCfDao() {
    return cfDao;
  }

  /**
   * @param cfDao the cfDao to set
   */
  public void setCfDao(ConfigFileDao cfDao) {
    this.cfDao = cfDao;
  }

  /**
   * @param isBeiJingServer the isBeiJingServer to set
   */
  public void setIsBeiJingServer(Boolean isBeiJingServer) {
    this.isBeiJingServer = isBeiJingServer;
  }

  /**
   * @param isTestServer the isTestServer to set
   */
  public void setIsTestServer(Boolean isTestServer) {
    this.isTestServer = isTestServer;
  }
  
}