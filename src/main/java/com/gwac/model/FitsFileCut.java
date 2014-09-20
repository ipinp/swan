package com.gwac.model;
// Generated 2014-9-1 13:05:37 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FitsFileCut generated by hbm2java
 */
@Entity
@Table(name="fits_file_cut"
    ,schema="public"
)
public class FitsFileCut  implements java.io.Serializable {


     private long ffcId;
     private Short dpmId;
     private Long ffId;
     private String fileName;
     private Float imgX;
     private Float imgY;
     private Boolean isMissed;
     private Boolean isTemplateCut;
     private Integer number;
     private Long otId;
     private Boolean requestCut;
     private Long starId;
     private String storePath;
     private Boolean successCut;
     private Long templateFfcId;

    public FitsFileCut() {
    }

    public FitsFileCut(Short dpmId, Long ffId, String fileName, Float imgX, Float imgY, Boolean isMissed, Boolean isTemplateCut, Integer number, Long otId, Boolean requestCut, Long starId, String storePath, Boolean successCut, Long templateFfcId) {
       this.dpmId = dpmId;
       this.ffId = ffId;
       this.fileName = fileName;
       this.imgX = imgX;
       this.imgY = imgY;
       this.isTemplateCut = isTemplateCut;
       this.number = number;
       this.otId = otId;
       this.starId = starId;
       this.storePath = storePath;
       this.templateFfcId = templateFfcId;
       this.requestCut = requestCut;
       this.successCut = successCut;
       this.isMissed = isMissed;
    }
   
     @GenericGenerator(name="generator", strategy="seqhilo", parameters={@Parameter(name="max_lo", value="49"), @Parameter(name="sequence", value="ffc_id_seq")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="ffc_id", unique=true, nullable=false)
    public long getFfcId() {
        return this.ffcId;
    }
    
    public void setFfcId(long ffcId) {
        this.ffcId = ffcId;
    }

    
    @Column(name="dpm_id")
    public Short getDpmId() {
        return this.dpmId;
    }
    
    public void setDpmId(Short dpmId) {
        this.dpmId = dpmId;
    }

    
    @Column(name="ff_id")
    public Long getFfId() {
        return this.ffId;
    }
    
    public void setFfId(Long ffId) {
        this.ffId = ffId;
    }

    
    @Column(name="file_name")
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    @Column(name="is_template_cut")
    public Boolean getIsTemplateCut() {
        return this.isTemplateCut;
    }
    
    public void setIsTemplateCut(Boolean isTemplateCut) {
        this.isTemplateCut = isTemplateCut;
    }

    
    @Column(name="number")
    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }

    
    @Column(name="ot_id")
    public Long getOtId() {
        return this.otId;
    }
    
    public void setOtId(Long otId) {
        this.otId = otId;
    }

    
    @Column(name="star_id")
    public Long getStarId() {
        return this.starId;
    }
    
    public void setStarId(Long starId) {
        this.starId = starId;
    }

    
    @Column(name="store_path")
    public String getStorePath() {
        return this.storePath;
    }
    
    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    
    @Column(name="template_ffc_id")
    public Long getTemplateFfcId() {
        return this.templateFfcId;
    }
    
    public void setTemplateFfcId(Long templateFfcId) {
        this.templateFfcId = templateFfcId;
    }

  /**
   * @return the requestCut
   */
    
  @Column(name="request_cut")
  public Boolean getRequestCut() {
    return requestCut;
  }

  /**
   * @param requestCut the requestCut to set
   */
  public void setRequestCut(Boolean requestCut) {
    this.requestCut = requestCut;
  }

  /**
   * @return the successCut
   */
  
  @Column(name="success_cut")
  public Boolean getSuccessCut() {
    return successCut;
  }

  /**
   * @param successCut the successCut to set
   */
  public void setSuccessCut(Boolean successCut) {
    this.successCut = successCut;
  }

  /**
   * @return the imgX
   */
  @Column(name="img_x")
  public Float getImgX() {
    return imgX;
  }

  /**
   * @param imgX the imgX to set
   */
  public void setImgX(Float imgX) {
    this.imgX = imgX;
  }

  /**
   * @return the imgY
   */
  @Column(name="img_y")
  public Float getImgY() {
    return imgY;
  }

  /**
   * @param imgY the imgY to set
   */
  public void setImgY(Float imgY) {
    this.imgY = imgY;
  }

  /**
   * @return the isMissed
   */
  @Column(name="is_missed")
  public Boolean getIsMissed() {
    return isMissed;
  }

  /**
   * @param isMissed the isMissed to set
   */
  public void setIsMissed(Boolean isMissed) {
    this.isMissed = isMissed;
  }




}


