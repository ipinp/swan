package com.gwac.model;
// Generated 2015-5-7 8:30:31 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ImageStatusParameterHis generated by hbm2java
 */
@Entity
@Table(name="image_status_parameter_his"
    ,schema="public"
)
public class ImageStatusParameterHis  implements java.io.Serializable {


     private long ispId;
     private Date timeObsUt;
     private Integer objNum;
     private Float bgBright;
     private Float fwhm;
     private Float s2n;
     private Float avgLimit;
     private Float extinc;
     private Float xshift;
     private Float yshift;
     private Float xrms;
     private Float yrms;
     private Integer ot1Num;
     private Integer var1Num;
     private Long ffId;
     private Float mountRa;
     private Float mountDec;
     private Short procStageId;
     private Float procTime;
     private Float avgEllipticity;
     private Float temperatureSet;
     private Float temperatureActual;

    public ImageStatusParameterHis() {
    }

	
    public ImageStatusParameterHis(long ispId) {
        this.ispId = ispId;
    }
    public ImageStatusParameterHis(long ispId, Date timeObsUt, Integer objNum, Float bgBright, Float fwhm, Float s2n, Float avgLimit, Float extinc, Float xshift, Float yshift, Float xrms, Float yrms, Integer ot1Num, Integer var1Num, Long ffId, Float mountRa, Float mountDec, Short procStageId, Float procTime, Float avgEllipticity, Float temperatureSet, Float temperatureActual) {
       this.ispId = ispId;
       this.timeObsUt = timeObsUt;
       this.objNum = objNum;
       this.bgBright = bgBright;
       this.fwhm = fwhm;
       this.s2n = s2n;
       this.avgLimit = avgLimit;
       this.extinc = extinc;
       this.xshift = xshift;
       this.yshift = yshift;
       this.xrms = xrms;
       this.yrms = yrms;
       this.ot1Num = ot1Num;
       this.var1Num = var1Num;
       this.ffId = ffId;
       this.mountRa = mountRa;
       this.mountDec = mountDec;
       this.procStageId = procStageId;
       this.procTime = procTime;
       this.avgEllipticity = avgEllipticity;
       this.temperatureSet = temperatureSet;
       this.temperatureActual = temperatureActual;
    }
   
     @Id 

    
    @Column(name="isp_id", unique=true, nullable=false)
    public long getIspId() {
        return this.ispId;
    }
    
    public void setIspId(long ispId) {
        this.ispId = ispId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="time_obs_ut", length=29)
    public Date getTimeObsUt() {
        return this.timeObsUt;
    }
    
    public void setTimeObsUt(Date timeObsUt) {
        this.timeObsUt = timeObsUt;
    }

    
    @Column(name="obj_num")
    public Integer getObjNum() {
        return this.objNum;
    }
    
    public void setObjNum(Integer objNum) {
        this.objNum = objNum;
    }

    
    @Column(name="bg_bright", precision=8, scale=8)
    public Float getBgBright() {
        return this.bgBright;
    }
    
    public void setBgBright(Float bgBright) {
        this.bgBright = bgBright;
    }

    
    @Column(name="fwhm", precision=8, scale=8)
    public Float getFwhm() {
        return this.fwhm;
    }
    
    public void setFwhm(Float fwhm) {
        this.fwhm = fwhm;
    }

    
    @Column(name="s2n", precision=8, scale=8)
    public Float getS2n() {
        return this.s2n;
    }
    
    public void setS2n(Float s2n) {
        this.s2n = s2n;
    }

    
    @Column(name="avg_limit", precision=8, scale=8)
    public Float getAvgLimit() {
        return this.avgLimit;
    }
    
    public void setAvgLimit(Float avgLimit) {
        this.avgLimit = avgLimit;
    }

    
    @Column(name="extinc", precision=8, scale=8)
    public Float getExtinc() {
        return this.extinc;
    }
    
    public void setExtinc(Float extinc) {
        this.extinc = extinc;
    }

    
    @Column(name="xshift", precision=8, scale=8)
    public Float getXshift() {
        return this.xshift;
    }
    
    public void setXshift(Float xshift) {
        this.xshift = xshift;
    }

    
    @Column(name="yshift", precision=8, scale=8)
    public Float getYshift() {
        return this.yshift;
    }
    
    public void setYshift(Float yshift) {
        this.yshift = yshift;
    }

    
    @Column(name="xrms", precision=8, scale=8)
    public Float getXrms() {
        return this.xrms;
    }
    
    public void setXrms(Float xrms) {
        this.xrms = xrms;
    }

    
    @Column(name="yrms", precision=8, scale=8)
    public Float getYrms() {
        return this.yrms;
    }
    
    public void setYrms(Float yrms) {
        this.yrms = yrms;
    }

    
    @Column(name="ot1_num")
    public Integer getOt1Num() {
        return this.ot1Num;
    }
    
    public void setOt1Num(Integer ot1Num) {
        this.ot1Num = ot1Num;
    }

    
    @Column(name="var1_num")
    public Integer getVar1Num() {
        return this.var1Num;
    }
    
    public void setVar1Num(Integer var1Num) {
        this.var1Num = var1Num;
    }

    
    @Column(name="ff_id")
    public Long getFfId() {
        return this.ffId;
    }
    
    public void setFfId(Long ffId) {
        this.ffId = ffId;
    }

    
    @Column(name="mount_ra", precision=8, scale=8)
    public Float getMountRa() {
        return this.mountRa;
    }
    
    public void setMountRa(Float mountRa) {
        this.mountRa = mountRa;
    }

    
    @Column(name="mount_dec", precision=8, scale=8)
    public Float getMountDec() {
        return this.mountDec;
    }
    
    public void setMountDec(Float mountDec) {
        this.mountDec = mountDec;
    }

    
    @Column(name="proc_stage_id")
    public Short getProcStageId() {
        return this.procStageId;
    }
    
    public void setProcStageId(Short procStageId) {
        this.procStageId = procStageId;
    }

    
    @Column(name="proc_time", precision=8, scale=8)
    public Float getProcTime() {
        return this.procTime;
    }
    
    public void setProcTime(Float procTime) {
        this.procTime = procTime;
    }

    
    @Column(name="avg_ellipticity", precision=8, scale=8)
    public Float getAvgEllipticity() {
        return this.avgEllipticity;
    }
    
    public void setAvgEllipticity(Float avgEllipticity) {
        this.avgEllipticity = avgEllipticity;
    }

    
    @Column(name="temperature_set", precision=8, scale=8)
    public Float getTemperatureSet() {
        return this.temperatureSet;
    }
    
    public void setTemperatureSet(Float temperatureSet) {
        this.temperatureSet = temperatureSet;
    }

    
    @Column(name="temperature_actual", precision=8, scale=8)
    public Float getTemperatureActual() {
        return this.temperatureActual;
    }
    
    public void setTemperatureActual(Float temperatureActual) {
        this.temperatureActual = temperatureActual;
    }




}

