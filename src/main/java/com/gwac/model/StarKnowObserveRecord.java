package com.gwac.model;
// Generated 2014-9-1 13:05:37 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * StarKnowObserveRecord generated by hbm2java
 */
@Entity
@Table(name="star_know_observe_record"
    ,schema="public"
)
public class StarKnowObserveRecord  implements java.io.Serializable {


     private long skorId;
     private Long cmpStarId;
     private Date datetime;
     private Float dec;
     private Float ellipticity;
     private Long ffId;
     private Float flux;
     private Float fluxErr;
     private Float fwhm;
     private Float mag;
     private Float magErr;
     private Long mchStarId;
     private Float ra;
     private Float signalNoise;
     private Long starId;
     private Float x;
     private Float y;

    public StarKnowObserveRecord() {
    }

	
    public StarKnowObserveRecord(long skorId) {
        this.skorId = skorId;
    }
    public StarKnowObserveRecord(long skorId, Long cmpStarId, Date datetime, Float dec, Float ellipticity, Long ffId, Float flux, Float fluxErr, Float fwhm, Float mag, Float magErr, Long mchStarId, Float ra, Float signalNoise, Long starId, Float x, Float y) {
       this.skorId = skorId;
       this.cmpStarId = cmpStarId;
       this.datetime = datetime;
       this.dec = dec;
       this.ellipticity = ellipticity;
       this.ffId = ffId;
       this.flux = flux;
       this.fluxErr = fluxErr;
       this.fwhm = fwhm;
       this.mag = mag;
       this.magErr = magErr;
       this.mchStarId = mchStarId;
       this.ra = ra;
       this.signalNoise = signalNoise;
       this.starId = starId;
       this.x = x;
       this.y = y;
    }
   
     @Id 

    
    @Column(name="skor_id", unique=true, nullable=false)
    public long getSkorId() {
        return this.skorId;
    }
    
    public void setSkorId(long skorId) {
        this.skorId = skorId;
    }

    
    @Column(name="cmp_star_id")
    public Long getCmpStarId() {
        return this.cmpStarId;
    }
    
    public void setCmpStarId(Long cmpStarId) {
        this.cmpStarId = cmpStarId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetime", length=29)
    public Date getDatetime() {
        return this.datetime;
    }
    
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    
    @Column(name="dec", precision=8, scale=8)
    public Float getDec() {
        return this.dec;
    }
    
    public void setDec(Float dec) {
        this.dec = dec;
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

    
    @Column(name="flux", precision=8, scale=8)
    public Float getFlux() {
        return this.flux;
    }
    
    public void setFlux(Float flux) {
        this.flux = flux;
    }

    
    @Column(name="flux_err", precision=8, scale=8)
    public Float getFluxErr() {
        return this.fluxErr;
    }
    
    public void setFluxErr(Float fluxErr) {
        this.fluxErr = fluxErr;
    }

    
    @Column(name="fwhm", precision=8, scale=8)
    public Float getFwhm() {
        return this.fwhm;
    }
    
    public void setFwhm(Float fwhm) {
        this.fwhm = fwhm;
    }

    
    @Column(name="mag", precision=8, scale=8)
    public Float getMag() {
        return this.mag;
    }
    
    public void setMag(Float mag) {
        this.mag = mag;
    }

    
    @Column(name="mag_err", precision=8, scale=8)
    public Float getMagErr() {
        return this.magErr;
    }
    
    public void setMagErr(Float magErr) {
        this.magErr = magErr;
    }

    
    @Column(name="mch_star_id")
    public Long getMchStarId() {
        return this.mchStarId;
    }
    
    public void setMchStarId(Long mchStarId) {
        this.mchStarId = mchStarId;
    }

    
    @Column(name="ra", precision=8, scale=8)
    public Float getRa() {
        return this.ra;
    }
    
    public void setRa(Float ra) {
        this.ra = ra;
    }

    
    @Column(name="signal_noise", precision=8, scale=8)
    public Float getSignalNoise() {
        return this.signalNoise;
    }
    
    public void setSignalNoise(Float signalNoise) {
        this.signalNoise = signalNoise;
    }

    
    @Column(name="star_id")
    public Long getStarId() {
        return this.starId;
    }
    
    public void setStarId(Long starId) {
        this.starId = starId;
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




}


