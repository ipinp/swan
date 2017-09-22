package com.gwac.model;
// Generated 2017-8-27 10:17:29 by Hibernate Tools 3.6.0

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
 * ObservationPlan generated by hbm2java
 */
@Entity
@Table(name = "observation_plan", schema = "public"
)
public class ObservationPlan implements java.io.Serializable {

  private long opId;
  private Long opSn;
  private Date opTime;
  private String opType;
  private Integer groupId;
  private Integer unitId;
  private String obsType;
  private Integer gridId;
  private Integer fieldId;
  private String objId;
  private Float ra;
  private Float dec;
  private Integer epoch;
  private Float objRa;
  private Float objDec;
  private Integer objEpoch;
  private Float objError;
  private String imgType;
  private Integer expusoreDuring;
  private Integer delay;
  private Integer frameCount;
  private Integer priority;
  private Date beginTime;
  private Date endTime;
  private Integer pairId;
  
  public boolean checkValid(){
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("opSn=");
    sb.append(opSn);
    sb.append(",opTime=");
    sb.append(opTime);
    sb.append(",opType=");
    sb.append(opType);
    sb.append(",groupId=");
    sb.append(groupId);
    sb.append(",unitId=");
    sb.append(unitId);
    sb.append(",obsType=");
    sb.append(obsType);
    sb.append(",gridId=");
    sb.append(gridId);
    sb.append(",fieldId=");
    sb.append(fieldId);
    sb.append(",ra=");
    sb.append(ra);
    sb.append(",dec=");
    sb.append(dec);
    sb.append(",epoch=");
    sb.append(epoch);
    sb.append(",objRa=");
    sb.append(objRa);
    sb.append(",objDec=");
    sb.append(objDec);
    sb.append(",objEpoch=");
    sb.append(objEpoch);
    sb.append(",objError=");
    sb.append(objError);
    sb.append(",imgType=");
    sb.append(imgType);
    sb.append(",expusoreDuring=");
    sb.append(expusoreDuring);
    sb.append(",delay=");
    sb.append(delay);
    sb.append(",frameCount=");
    sb.append(frameCount);
    sb.append(",priority=");
    sb.append(priority);
    sb.append(",beginTime=");
    sb.append(beginTime);
    sb.append(",endTime=");
    sb.append(endTime);
    sb.append(",pairId=");
    sb.append(pairId);
    return sb.toString();
  }

  public ObservationPlan() {
  }

  public ObservationPlan(long opId) {
    this.opId = opId;
  }

  public ObservationPlan(long opId, Long opSn, Date opTime, String opType, Integer groupId, Integer unitId, String obsType, Integer gridId, Integer fieldId, String objId, Float ra, Float dec, Integer epoch, Float objRa, Float objDec, Integer objEpoch, Float objError, String imgType, Integer expusoreDuring, Integer delay, Integer frameCount, Integer priority, Date beginTime, Date endTime, Integer pairId) {
    this.opId = opId;
    this.opSn = opSn;
    this.opTime = opTime;
    this.opType = opType;
    this.groupId = groupId;
    this.unitId = unitId;
    this.obsType = obsType;
    this.gridId = gridId;
    this.fieldId = fieldId;
    this.objId = objId;
    this.ra = ra;
    this.dec = dec;
    this.epoch = epoch;
    this.objRa = objRa;
    this.objDec = objDec;
    this.objEpoch = objEpoch;
    this.objError = objError;
    this.imgType = imgType;
    this.expusoreDuring = expusoreDuring;
    this.delay = delay;
    this.frameCount = frameCount;
    this.priority = priority;
    this.beginTime = beginTime;
    this.endTime = endTime;
    this.pairId = pairId;
  }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "op_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "op_id", unique = true, nullable = false)
  public long getOpId() {
    return this.opId;
  }

  public void setOpId(long opId) {
    this.opId = opId;
  }

  @Column(name = "op_sn")
  public Long getOpSn() {
    return this.opSn;
  }

  public void setOpSn(Long opSn) {
    this.opSn = opSn;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "op_time", length = 29)
  public Date getOpTime() {
    return this.opTime;
  }

  public void setOpTime(Date opTime) {
    this.opTime = opTime;
  }

  @Column(name = "op_type")
  public String getOpType() {
    return this.opType;
  }

  public void setOpType(String opType) {
    this.opType = opType;
  }

  @Column(name = "group_id")
  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  @Column(name = "unit_id")
  public Integer getUnitId() {
    return this.unitId;
  }

  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  @Column(name = "obs_type")
  public String getObsType() {
    return this.obsType;
  }

  public void setObsType(String obsType) {
    this.obsType = obsType;
  }

  @Column(name = "grid_id")
  public Integer getGridId() {
    return this.gridId;
  }

  public void setGridId(Integer gridId) {
    this.gridId = gridId;
  }

  @Column(name = "field_id")
  public Integer getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  @Column(name = "obj_id")
  public String getObjId() {
    return this.objId;
  }

  public void setObjId(String objId) {
    this.objId = objId;
  }

  @Column(name = "ra", precision = 8, scale = 8)
  public Float getRa() {
    return this.ra;
  }

  public void setRa(Float ra) {
    this.ra = ra;
  }

  @Column(name = "dec", precision = 8, scale = 8)
  public Float getDec() {
    return this.dec;
  }

  public void setDec(Float dec) {
    this.dec = dec;
  }

  @Column(name = "epoch")
  public Integer getEpoch() {
    return this.epoch;
  }

  public void setEpoch(Integer epoch) {
    this.epoch = epoch;
  }

  @Column(name = "obj_ra", precision = 8, scale = 8)
  public Float getObjRa() {
    return this.objRa;
  }

  public void setObjRa(Float objRa) {
    this.objRa = objRa;
  }

  @Column(name = "obj_dec", precision = 8, scale = 8)
  public Float getObjDec() {
    return this.objDec;
  }

  public void setObjDec(Float objDec) {
    this.objDec = objDec;
  }

  @Column(name = "obj_epoch")
  public Integer getObjEpoch() {
    return this.objEpoch;
  }

  public void setObjEpoch(Integer objEpoch) {
    this.objEpoch = objEpoch;
  }

  @Column(name = "obj_error", precision = 8, scale = 8)
  public Float getObjError() {
    return this.objError;
  }

  public void setObjError(Float objError) {
    this.objError = objError;
  }

  @Column(name = "img_type")
  public String getImgType() {
    return this.imgType;
  }

  public void setImgType(String imgType) {
    this.imgType = imgType;
  }

  @Column(name = "expusore_during")
  public Integer getExpusoreDuring() {
    return this.expusoreDuring;
  }

  public void setExpusoreDuring(Integer expusoreDuring) {
    this.expusoreDuring = expusoreDuring;
  }

  @Column(name = "delay")
  public Integer getDelay() {
    return this.delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  @Column(name = "frame_count")
  public Integer getFrameCount() {
    return this.frameCount;
  }

  public void setFrameCount(Integer frameCount) {
    this.frameCount = frameCount;
  }

  @Column(name = "priority")
  public Integer getPriority() {
    return this.priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

//  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "begin_time", length = 29)
  public Date getBeginTime() {
    return this.beginTime;
  }

  public void setBeginTime(Date beginTime) {
    this.beginTime = beginTime;
  }

//  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "end_time", length = 29)
  public Date getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  @Column(name = "pair_id")
  public Integer getPairId() {
    return this.pairId;
  }

  public void setPairId(Integer pairId) {
    this.pairId = pairId;
  }

}
