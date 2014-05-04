package com.gwac.model;
// Generated May 4, 2014 10:28:46 AM by Hibernate Tools 3.2.2.GA



/**
 * Telescope generated by hbm2java
 */
public class Telescope  implements java.io.Serializable {


     private short tspId;
     private String name;
     private Float ra;
     private Float dec;
     private Short diameter;
     private Float focalRatio;
     private String ccdType;

    public Telescope() {
    }

	
    public Telescope(short tspId) {
        this.tspId = tspId;
    }
    public Telescope(short tspId, String name, Float ra, Float dec, Short diameter, Float focalRatio, String ccdType) {
       this.tspId = tspId;
       this.name = name;
       this.ra = ra;
       this.dec = dec;
       this.diameter = diameter;
       this.focalRatio = focalRatio;
       this.ccdType = ccdType;
    }
   
    public short getTspId() {
        return this.tspId;
    }
    
    public void setTspId(short tspId) {
        this.tspId = tspId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Float getRa() {
        return this.ra;
    }
    
    public void setRa(Float ra) {
        this.ra = ra;
    }
    public Float getDec() {
        return this.dec;
    }
    
    public void setDec(Float dec) {
        this.dec = dec;
    }
    public Short getDiameter() {
        return this.diameter;
    }
    
    public void setDiameter(Short diameter) {
        this.diameter = diameter;
    }
    public Float getFocalRatio() {
        return this.focalRatio;
    }
    
    public void setFocalRatio(Float focalRatio) {
        this.focalRatio = focalRatio;
    }
    public String getCcdType() {
        return this.ccdType;
    }
    
    public void setCcdType(String ccdType) {
        this.ccdType = ccdType;
    }




}


