package com.gwac.model;
// Generated 2015-12-17 20:17:15 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FollowUpObjectType generated by hbm2java
 */
@Entity
@Table(name="follow_up_object_type"
    ,schema="public"
)
public class FollowUpObjectType  implements java.io.Serializable {


     private short fuoTypeId;
     private String fuoTypeName;
     private String fuoTypeComment;

    public FollowUpObjectType() {
    }

	
    public FollowUpObjectType(short fuoTypeId) {
        this.fuoTypeId = fuoTypeId;
    }
    public FollowUpObjectType(short fuoTypeId, String fuoTypeName, String fuoTypeComment) {
       this.fuoTypeId = fuoTypeId;
       this.fuoTypeName = fuoTypeName;
       this.fuoTypeComment = fuoTypeComment;
    }

  @GenericGenerator(name = "generator", strategy = "seqhilo", parameters = {
    @Parameter(name = "max_lo", value = "49"),
    @Parameter(name = "sequence", value = "fuo_type_id_seq")})
     @Id 
  @GeneratedValue(generator = "generator")
    @Column(name="fuo_type_id", unique=true, nullable=false)
    public short getFuoTypeId() {
        return this.fuoTypeId;
    }
    
    public void setFuoTypeId(short fuoTypeId) {
        this.fuoTypeId = fuoTypeId;
    }

    
    @Column(name="fuo_type_name", length=16)
    public String getFuoTypeName() {
        return this.fuoTypeName;
    }
    
    public void setFuoTypeName(String fuoTypeName) {
        this.fuoTypeName = fuoTypeName;
    }

    
    @Column(name="fuo_type_comment")
    public String getFuoTypeComment() {
        return this.fuoTypeComment;
    }
    
    public void setFuoTypeComment(String fuoTypeComment) {
        this.fuoTypeComment = fuoTypeComment;
    }




}


