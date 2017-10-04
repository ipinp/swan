package com.gwac.model;
// Generated 2017-1-10 20:46:20 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SystemKeyword generated by hbm2java
 */
@Entity
@Table(name="system_keyword"
    ,schema="public"
)
public class SystemKeyword  implements java.io.Serializable {


     private short sysKwId;
     private Short objTypeId;
     private String sysKwName;
     private String sysKwNameCh;
     private String comment;

    public SystemKeyword() {
    }

	
    public SystemKeyword(short sysKwId) {
        this.sysKwId = sysKwId;
    }
    public SystemKeyword(short sysKwId, Short objTypeId, String sysKwName, String sysKwNameCh, String comment) {
       this.sysKwId = sysKwId;
       this.objTypeId = objTypeId;
       this.sysKwName = sysKwName;
       this.sysKwNameCh = sysKwNameCh;
       this.comment = comment;
    }
   
     @Id 

    
    @Column(name="sys_kw_id", unique=true, nullable=false)
    public short getSysKwId() {
        return this.sysKwId;
    }
    
    public void setSysKwId(short sysKwId) {
        this.sysKwId = sysKwId;
    }

    
    @Column(name="obj_type_id")
    public Short getObjTypeId() {
        return this.objTypeId;
    }
    
    public void setObjTypeId(Short objTypeId) {
        this.objTypeId = objTypeId;
    }

    
    @Column(name="sys_kw _name", length=128)
    public String getSysKwName() {
        return this.sysKwName;
    }
    
    public void setSysKwName(String sysKwName) {
        this.sysKwName = sysKwName;
    }

    
    @Column(name="sys_kw _name_ch", length=128)
    public String getSysKwNameCh() {
        return this.sysKwNameCh;
    }
    
    public void setSysKwNameCh(String sysKwNameCh) {
        this.sysKwNameCh = sysKwNameCh;
    }

    
    @Column(name="comment", length=1024)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}

