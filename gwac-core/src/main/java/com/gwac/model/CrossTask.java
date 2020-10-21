package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ConfigFile generated by hbm2java
 */
@Entity
@Table(name = "cross_task", schema = "public"
)
public class CrossTask implements java.io.Serializable {

  private long ctId;
  private String ctName;
  private Date createTime;
  private Integer ffCount;
  private Integer objCount;
  private Integer crossMethod;
  private String dateStr;
  private Float mergedR;
  private Float mergedMag;
  private Float cvsR;
  private Float cvsMag;
  private Float rc3R;
  private Float rc3MinMag;
  private Float rc3MaxMag;
  private Float minorPlanetR;
  private Float minorPlanetMag;
  private Float ot2HisR;
  private Float ot2HisMag;
  private Float usnoR1;
  private Float usnoMag1;
  private Float usnoR2;
  private Float usnoMag2;
  private Integer telescopeId;
  

  public CrossTask() {
  }

  public CrossTask(long ctId) {
    this.ctId = ctId;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "cross_t_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "ct_id", unique = true, nullable = false)
  public long getCtId() {
    return this.ctId;
  }

  public void setCtId(long ctId) {
    this.ctId = ctId;
  }

  /**
   * @return the ctName
   */
  @Column(name = "ct_name")
  public String getCtName() {
    return ctName;
  }

  /**
   * @param ctName the ctName to set
   */
  public void setCtName(String ctName) {
    this.ctName = ctName;
  }

  /**
   * @return the createTime
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "create_time")
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * @param createTime the createTime to set
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  /**
   * @return the ffCount
   */
  @Column(name = "ff_count")
  public Integer getFfCount() {
    return ffCount;
  }

  /**
   * @param ffCount the ffCount to set
   */
  public void setFfCount(Integer ffCount) {
    this.ffCount = ffCount;
  }

  /**
   * @return the objCount
   */
  @Column(name = "obj_count")
  public Integer getObjCount() {
    return objCount;
  }

  /**
   * @param objCount the objCount to set
   */
  public void setObjCount(Integer objCount) {
    this.objCount = objCount;
  }

  /**
   * @return the crossMethod
   */
  @Column(name = "cross_method")
  public Integer getCrossMethod() {
    return crossMethod;
  }

  /**
   * @param crossMethod the crossMethod to set
   */
  public void setCrossMethod(Integer crossMethod) {
    this.crossMethod = crossMethod;
  }

  /**
   * @return the dateStr
   */
  @Column(name = "date_str")
  public String getDateStr() {
    return dateStr;
  }

  /**
   * @param dateStr the dateStr to set
   */
  public void setDateStr(String dateStr) {
    this.dateStr = dateStr;
  }

  /**
   * @return the mergedR
   */
  @Column(name = "merged_r")
  public Float getMergedR() {
    return mergedR;
  }

  /**
   * @param mergedR the mergedR to set
   */
  public void setMergedR(Float mergedR) {
    this.mergedR = mergedR;
  }

  /**
   * @return the mergedMag
   */
  @Column(name = "merged_mag")
  public Float getMergedMag() {
    return mergedMag;
  }

  /**
   * @param mergedMag the mergedMag to set
   */
  public void setMergedMag(Float mergedMag) {
    this.mergedMag = mergedMag;
  }

  /**
   * @return the cvsR
   */
  @Column(name = "cvs_r")
  public Float getCvsR() {
    return cvsR;
  }

  /**
   * @param cvsR the cvsR to set
   */
  public void setCvsR(Float cvsR) {
    this.cvsR = cvsR;
  }

  /**
   * @return the cvsMag
   */
  @Column(name = "cvs_mag")
  public Float getCvsMag() {
    return cvsMag;
  }

  /**
   * @param cvsMag the cvsMag to set
   */
  public void setCvsMag(Float cvsMag) {
    this.cvsMag = cvsMag;
  }

  /**
   * @return the rc3R
   */
  @Column(name = "rc3_r")
  public Float getRc3R() {
    return rc3R;
  }

  /**
   * @param rc3R the rc3R to set
   */
  public void setRc3R(Float rc3R) {
    this.rc3R = rc3R;
  }

  /**
   * @return the rc3Mag
   */
  @Column(name = "rc3_min_mag")
  public Float getRc3MinMag() {
    return rc3MinMag;
  }

  /**
   * @param rc3Mag the rc3MinMag to set
   */
  public void setRc3MinMag(Float rc3MinMag) {
    this.rc3MinMag = rc3MinMag;
  }


  /**
   * @return the rc3Mag
   */
  @Column(name = "rc3_max_mag")
  public Float getRc3MaxMag() {
    return rc3MaxMag;
  }

  /**
   * @param rc3Mag the rc3MaxMag to set
   */
  public void setRc3MaxMag(Float rc3MaxMag) {
    this.rc3MaxMag = rc3MaxMag;
  }
  /**
   * @return the minorPlanetR
   */
  @Column(name = "minor_planet_r")
  public Float getMinorPlanetR() {
    return minorPlanetR;
  }

  /**
   * @param minorPlanetR the minorPlanetR to set
   */
  public void setMinorPlanetR(Float minorPlanetR) {
    this.minorPlanetR = minorPlanetR;
  }

  /**
   * @return the minorPlanetMag
   */
  @Column(name = "minor_planet_mag")
  public Float getMinorPlanetMag() {
    return minorPlanetMag;
  }

  /**
   * @param minorPlanetMag the minorPlanetMag to set
   */
  public void setMinorPlanetMag(Float minorPlanetMag) {
    this.minorPlanetMag = minorPlanetMag;
  }

  /**
   * @return the ot2HisR
   */
  @Column(name = "ot2_his_r")
  public Float getOt2HisR() {
    return ot2HisR;
  }

  /**
   * @param ot2HisR the ot2HisR to set
   */
  public void setOt2HisR(Float ot2HisR) {
    this.ot2HisR = ot2HisR;
  }

  /**
   * @return the ot2HisMag
   */
  @Column(name = "ot2_his_mag")
  public Float getOt2HisMag() {
    return ot2HisMag;
  }

  /**
   * @param ot2HisMag the ot2HisMag to set
   */
  public void setOt2HisMag(Float ot2HisMag) {
    this.ot2HisMag = ot2HisMag;
  }

  /**
   * @return the usnoR1
   */
  @Column(name = "usno_r1")
  public Float getUsnoR1() {
    return usnoR1;
  }

  /**
   * @param usnoR1 the usnoR1 to set
   */
  public void setUsnoR1(Float usnoR1) {
    this.usnoR1 = usnoR1;
  }

  /**
   * @return the usnnoMag1
   */
  @Column(name = "usno_mag1")
  public Float getUsnoMag1() {
    return usnoMag1;
  }

  /**
   * @param usnoMag1 the usnoMag1 to set
   */
  public void setUsnoMag1(Float usnoMag1) {
    this.usnoMag1 = usnoMag1;
  }

  /**
   * @return the usnoR2
   */
  @Column(name = "usno_r2")
  public Float getUsnoR2() {
    return usnoR2;
  }

  /**
   * @param usnoR2 the usnoR2 to set
   */
  public void setUsnoR2(Float usnoR2) {
    this.usnoR2 = usnoR2;
  }

  /**
   * @return the usnnoMag2
   */
  @Column(name = "usno_mag2")
  public Float getUsnoMag2() {
    return usnoMag2;
  }

  /**
   * @param usnoMag2 the usnoMag2 to set
   */
  public void setUsnoMag2(Float usnoMag2) {
    this.usnoMag2 = usnoMag2;
  }


  /**
   * @return the usnnoMag2 
   */
  @Column(name = "telescope_id")
  public Integer getTelescopeId() {
    return telescopeId;
  }

  /**
   * @param telescopeId the usnoMag2 to set
   */
  public void setTelescopeId(Integer telescopeId) {
    this.telescopeId = telescopeId;
  }
}