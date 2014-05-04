package com.gwac.model;
// Generated May 4, 2014 10:28:46 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;

/**
 * Environment generated by hbm2java
 */
public class Environment  implements java.io.Serializable {


     private long envId;
     private Date date;
     private Date time;
     private String wather;
     private Float windSpeed;
     private Float temperature;
     private Float humidity;
     private Float seeing;
     private Float cloudPercent;

    public Environment() {
    }

	
    public Environment(long envId) {
        this.envId = envId;
    }
    public Environment(long envId, Date date, Date time, String wather, Float windSpeed, Float temperature, Float humidity, Float seeing, Float cloudPercent) {
       this.envId = envId;
       this.date = date;
       this.time = time;
       this.wather = wather;
       this.windSpeed = windSpeed;
       this.temperature = temperature;
       this.humidity = humidity;
       this.seeing = seeing;
       this.cloudPercent = cloudPercent;
    }
   
    public long getEnvId() {
        return this.envId;
    }
    
    public void setEnvId(long envId) {
        this.envId = envId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getWather() {
        return this.wather;
    }
    
    public void setWather(String wather) {
        this.wather = wather;
    }
    public Float getWindSpeed() {
        return this.windSpeed;
    }
    
    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }
    public Float getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }
    public Float getHumidity() {
        return this.humidity;
    }
    
    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }
    public Float getSeeing() {
        return this.seeing;
    }
    
    public void setSeeing(Float seeing) {
        this.seeing = seeing;
    }
    public Float getCloudPercent() {
        return this.cloudPercent;
    }
    
    public void setCloudPercent(Float cloudPercent) {
        this.cloudPercent = cloudPercent;
    }




}


