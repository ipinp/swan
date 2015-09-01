package com.gwac.model;
// Generated 2014-9-1 13:05:37 by Hibernate Tools 3.6.0


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
 * OtObserveRecord generated by hbm2java
 */
@Entity
@Table(name="ot_observe_record"
    ,schema="public"
)
public class OtObserveRecord  implements java.io.Serializable {


     private long oorId;
     private Float XTemp;
     private Float YTemp;
     private Float background;
     private Float classStar;
     private String dateStr;
     private Date dateUt;
     private Float decD;
     private Integer dpmId;
     private Float ellipticity;
     private Long ffId;
     private Integer ffNumber;
     private Long ffcId;
     private Boolean flag;
     private Float flagChb;
     private Float flux;
     private Float magAper;
     private Float magerrAper;
     private Boolean otFlag;
     private Long otId;
     private Short otTypeId;
     private Float raD;
     private Boolean requestCut;
     private Boolean successCut;
     private Float threshold;
     private Float x;
     private Float y;
     protected Short skyId;

    public OtObserveRecord() {
    }

    public OtObserveRecord(Float XTemp, Float YTemp, Float background, Float classStar, String dateStr, Date dateUt, Float decD, Integer dpmId, Float ellipticity, Long ffId, Integer ffNumber, Long ffcId, Boolean flag, Float flagChb, Float flux, Float magAper, Float magerrAper, Boolean otFlag, Long otId, Short otTypeId, Float raD, Boolean requestCut, Boolean successCut, Float threshold, Float x, Float y) {
       this.XTemp = XTemp;
       this.YTemp = YTemp;
       this.background = background;
       this.classStar = classStar;
       this.dateStr = dateStr;
       this.dateUt = dateUt;
       this.decD = decD;
       this.dpmId = dpmId;
       this.ellipticity = ellipticity;
       this.ffId = ffId;
       this.ffNumber = ffNumber;
       this.ffcId = ffcId;
       this.flag = flag;
       this.flagChb = flagChb;
       this.flux = flux;
       this.magAper = magAper;
       this.magerrAper = magerrAper;
       this.otFlag = otFlag;
       this.otId = otId;
       this.otTypeId = otTypeId;
       this.raD = raD;
       this.requestCut = requestCut;
       this.successCut = successCut;
       this.threshold = threshold;
       this.x = x;
       this.y = y;
    }
   
     @GenericGenerator(name="generator", strategy="seqhilo", parameters={@Parameter(name="max_lo", value="49"), @Parameter(name="sequence", value="oor_id_seq")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="oor_id", unique=true, nullable=false)
    public long getOorId() {
        return this.oorId;
    }
    
    public void setOorId(long oorId) {
        this.oorId = oorId;
    }

    
    @Column(name="x_temp", precision=8, scale=8)
    public Float getXTemp() {
        return this.XTemp;
    }
    
    public void setXTemp(Float XTemp) {
        this.XTemp = XTemp;
    }

    
    @Column(name="y_temp", precision=8, scale=8)
    public Float getYTemp() {
        return this.YTemp;
    }
    
    public void setYTemp(Float YTemp) {
        this.YTemp = YTemp;
    }

    
    @Column(name="background", precision=8, scale=8)
    public Float getBackground() {
        return this.background;
    }
    
    public void setBackground(Float background) {
        this.background = background;
    }

    
    @Column(name="class_star")
    public Float getClassStar() {
        return this.classStar;
    }
    
    public void setClassStar(Float classStar) {
        this.classStar = classStar;
    }

    
    @Column(name="date_str", length=6)
    public String getDateStr() {
        return this.dateStr;
    }
    
    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_ut", length=29)
    public Date getDateUt() {
        return this.dateUt;
    }
    
    public void setDateUt(Date dateUt) {
        this.dateUt = dateUt;
    }

    
    @Column(name="dec_d", precision=8, scale=8)
    public Float getDecD() {
        return this.decD;
    }
    
    public void setDecD(Float decD) {
        this.decD = decD;
    }

    
    @Column(name="dpm_id")
    public Integer getDpmId() {
        return this.dpmId;
    }
    
    public void setDpmId(Integer dpmId) {
        this.dpmId = dpmId;
    }

    
    @Column(name="ellipticity", precision=8, scale=8)
    public Float getEllipticity() {
        return this.ellipticity;
    }
    
    public void setEllipticity(Float ellipticity) {
        this.ellipticity = ellipticity;
    }

    
    @Column(name="ff_id")
    public Long getFfId() {
        return this.ffId;
    }
    
    public void setFfId(Long ffId) {
        this.ffId = ffId;
    }

    
    @Column(name="ff_number")
    public Integer getFfNumber() {
        return this.ffNumber;
    }
    
    public void setFfNumber(Integer ffNumber) {
        this.ffNumber = ffNumber;
    }

    
    @Column(name="ffc_id")
    public Long getFfcId() {
        return this.ffcId;
    }
    
    public void setFfcId(Long ffcId) {
        this.ffcId = ffcId;
    }

    
    @Column(name="flag")
    public Boolean getFlag() {
        return this.flag;
    }
    
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    
    @Column(name="flag_chb", precision=8, scale=8)
    public Float getFlagChb() {
        return this.flagChb;
    }
    
    public void setFlagChb(Float flagChb) {
        this.flagChb = flagChb;
    }

    
    @Column(name="flux", precision=8, scale=8)
    public Float getFlux() {
        return this.flux;
    }
    
    public void setFlux(Float flux) {
        this.flux = flux;
    }

    
    @Column(name="mag_aper", precision=8, scale=8)
    public Float getMagAper() {
        return this.magAper;
    }
    
    public void setMagAper(Float magAper) {
        this.magAper = magAper;
    }

    
    @Column(name="magerr_aper", precision=8, scale=8)
    public Float getMagerrAper() {
        return this.magerrAper;
    }
    
    public void setMagerrAper(Float magerrAper) {
        this.magerrAper = magerrAper;
    }

    
    @Column(name="ot_flag")
    public Boolean getOtFlag() {
        return this.otFlag;
    }
    
    public void setOtFlag(Boolean otFlag) {
        this.otFlag = otFlag;
    }

    
    @Column(name="ot_id")
    public Long getOtId() {
        return this.otId;
    }
    
    public void setOtId(Long otId) {
        this.otId = otId;
    }

    
    @Column(name="ot_type_id")
    public Short getOtTypeId() {
        return this.otTypeId;
    }
    
    public void setOtTypeId(Short otTypeId) {
        this.otTypeId = otTypeId;
    }

    
    @Column(name="ra_d", precision=8, scale=8)
    public Float getRaD() {
        return this.raD;
    }
    
    public void setRaD(Float raD) {
        this.raD = raD;
    }

    
    @Column(name="request_cut")
    public Boolean getRequestCut() {
        return this.requestCut;
    }
    
    public void setRequestCut(Boolean requestCut) {
        this.requestCut = requestCut;
    }

    
    @Column(name="success_cut")
    public Boolean getSuccessCut() {
        return this.successCut;
    }
    
    public void setSuccessCut(Boolean successCut) {
        this.successCut = successCut;
    }

    
    @Column(name="threshold", precision=8, scale=8)
    public Float getThreshold() {
        return this.threshold;
    }
    
    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    
    @Column(name="x", precision=8, scale=8)
    public Float getX() {
        return this.x;
    }
    
    public void setX(Float x) {
        this.x = x;
    }

    
    @Column(name="y", precision=8, scale=8)
    public Float getY() {
        return this.y;
    }
    
    public void setY(Float y) {
        this.y = y;
    }

    /**
     * @return the skyId
     */
  @Column(name = "sky_id")
    public Short getSkyId() {
        return skyId;
    }

    /**
     * @param skyId the skyId to set
     */
    public void setSkyId(Short skyId) {
        this.skyId = skyId;
    }




}


