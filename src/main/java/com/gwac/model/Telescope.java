package com.gwac.model;
// Generated 2014-9-1 13:05:37 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Telescope generated by hbm2java
 */
@Entity
@Table(name="telescope"
    ,schema="public"
)
public class Telescope  implements java.io.Serializable {


     private short tspId;
     private String ccdType;
     private Float dec;
     private Short diameter;
     private Float focalRatio;
     private String name;
     private Float ra;

    public Telescope() {
    }

	
    public Telescope(short tspId) {
        this.tspId = tspId;
    }
    public Telescope(short tspId, String ccdType, Float dec, Short diameter, Float focalRatio, String name, Float ra) {
       this.tspId = tspId;
       this.ccdType = ccdType;
       this.dec = dec;
       this.diameter = diameter;
       this.focalRatio = focalRatio;
       this.name = name;
       this.ra = ra;
    }
   
     @Id 

    
    @Column(name="tsp_id", unique=true, nullable=false)
    public short getTspId() {
        return this.tspId;
    }
    
    public void setTspId(short tspId) {
        this.tspId = tspId;
    }

    
    @Column(name="ccd_type")
    public String getCcdType() {
        return this.ccdType;
    }
    
    public void setCcdType(String ccdType) {
        this.ccdType = ccdType;
    }

    
    @Column(name="dec", precision=8, scale=8)
    public Float getDec() {
        return this.dec;
    }
    
    public void setDec(Float dec) {
        this.dec = dec;
    }

    
    @Column(name="diameter")
    public Short getDiameter() {
        return this.diameter;
    }
    
    public void setDiameter(Short diameter) {
        this.diameter = diameter;
    }

    
    @Column(name="focal_ratio", precision=8, scale=8)
    public Float getFocalRatio() {
        return this.focalRatio;
    }
    
    public void setFocalRatio(Float focalRatio) {
        this.focalRatio = focalRatio;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ra", precision=8, scale=8)
    public Float getRa() {
        return this.ra;
    }
    
    public void setRa(Float ra) {
        this.ra = ra;
    }




}


