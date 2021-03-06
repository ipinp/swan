package com.gwac.model;
// Generated 2015-11-5 20:06:22 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * OtType generated by hbm2java
 */
@Entity
@Table(name="ot_type"
    ,schema="public"
)
public class OtType  implements java.io.Serializable {


     private short ottId;
     private String ottName;
     private String comment;

    public OtType() {
    }

	
    public OtType(short ottId) {
        this.ottId = ottId;
    }
    public OtType(short ottId, String ottName, String comment) {
       this.ottId = ottId;
       this.ottName = ottName;
       this.comment = comment;
    }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "ott_id_seq")})
  @Id
  @GeneratedValue(generator = "generator")
    @Column(name="ott_id", unique=true, nullable=false)
    public short getOttId() {
        return this.ottId;
    }
    
    public void setOttId(short ottId) {
        this.ottId = ottId;
    }

    
    @Column(name="ott_name", length=64)
    public String getOttName() {
        return this.ottName;
    }
    
    public void setOttName(String ottName) {
        this.ottName = ottName;
    }

    
    @Column(name="comment", length=1024)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


