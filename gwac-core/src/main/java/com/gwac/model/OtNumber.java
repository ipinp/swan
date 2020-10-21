package com.gwac.model;
// Generated 2015-10-2 9:40:37 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * OtNumber generated by hbm2java
 */
@Entity
@Table(name = "ot_number", schema = "public"
)
public class OtNumber implements java.io.Serializable {

  private long otnId;
  private String date;
  private Integer number;
  private Character otLevel;
  private Integer varNumber;
  private Integer subNumber;
  private Integer jfwvNumber;
  private Integer jfovSubNumber;
  private Integer followupNumber;

  public OtNumber() {
    this.number = 0;
    this.varNumber = 0;
    this.subNumber = 0;
    this.jfwvNumber = 0;
    this.jfovSubNumber = 0;
    this.followupNumber = 0;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "otn_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")

  @Column(name = "otn_id", unique = true, nullable = false)
  public long getOtnId() {
    return this.otnId;
  }

  public void setOtnId(long otnId) {
    this.otnId = otnId;
  }

  @Column(name = "date", length = 32)
  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Column(name = "number")
  public Integer getNumber() {
    return this.number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  @Column(name = "ot_level", length = 1)
  public Character getOtLevel() {
    return this.otLevel;
  }

  public void setOtLevel(Character otLevel) {
    this.otLevel = otLevel;
  }

  /**
   * @return the VarNumber
   */
  @Column(name = "var_Number")
  public Integer getVarNumber() {
    return varNumber;
  }

  /**
   * @param varNumber the VarNumber to set
   */
  public void setVarNumber(Integer varNumber) {
    this.varNumber = varNumber;
  }

  /**
   * @return the subNumber
   */
  @Column(name = "sub_number")
  public Integer getSubNumber() {
    return subNumber;
  }

  /**
   * @param subNumber the subNumber to set
   */
  public void setSubNumber(Integer subNumber) {
    this.subNumber = subNumber;
  }

  /**
   * @return the jfwvNumber
   */
  @Column(name = "jfov_number")
  public Integer getJfwvNumber() {
    return jfwvNumber;
  }

  /**
   * @param jfwvNumber the jfwvNumber to set
   */
  public void setJfwvNumber(Integer jfwvNumber) {
    this.jfwvNumber = jfwvNumber;
  }

  /**
   * @return the jfovSubNumber
   */
  @Column(name = "jfov_sub_number")
  public Integer getJfovSubNumber() {
    return jfovSubNumber;
  }

  /**
   * @param jfovSubNumber the jfovSubNumber to set
   */
  public void setJfovSubNumber(Integer jfovSubNumber) {
    this.jfovSubNumber = jfovSubNumber;
  }

  /**
   * @return the followupNumber 
   */
  @Column(name = "followup_number")
  public Integer getFollowupNumber() {
    return followupNumber;
  }

  /**
   * @param followupNumber the followupNumber to set
   */
  public void setFollowupNumber(Integer followupNumber) {
    this.followupNumber = followupNumber;
  }

}