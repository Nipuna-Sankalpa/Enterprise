package com.servicemaster.models;
// Generated Sep 2, 2017 1:38:10 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UomConversion generated by hbm2java
 */
public class UomConversion  implements java.io.Serializable {


     private String uomConversionCode;
     private Uom uomByUomUomCode;
     private Uom uomByUomUomCodeTo;
     private Float multipliedBy;
     private Float dividedBy;
     private String uomConversioncol;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;

    public UomConversion() {
    }

	
    public UomConversion(String uomConversionCode, Uom uomByUomUomCode, Uom uomByUomUomCodeTo) {
        this.uomConversionCode = uomConversionCode;
        this.uomByUomUomCode = uomByUomUomCode;
        this.uomByUomUomCodeTo = uomByUomUomCodeTo;
    }
    public UomConversion(String uomConversionCode, Uom uomByUomUomCode, Uom uomByUomUomCodeTo, Float multipliedBy, Float dividedBy, String uomConversioncol, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks) {
       this.uomConversionCode = uomConversionCode;
       this.uomByUomUomCode = uomByUomUomCode;
       this.uomByUomUomCodeTo = uomByUomUomCodeTo;
       this.multipliedBy = multipliedBy;
       this.dividedBy = dividedBy;
       this.uomConversioncol = uomConversioncol;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
    }
   
    public String getUomConversionCode() {
        return this.uomConversionCode;
    }
    
    public void setUomConversionCode(String uomConversionCode) {
        this.uomConversionCode = uomConversionCode;
    }
    public Uom getUomByUomUomCode() {
        return this.uomByUomUomCode;
    }
    
    public void setUomByUomUomCode(Uom uomByUomUomCode) {
        this.uomByUomUomCode = uomByUomUomCode;
    }
    public Uom getUomByUomUomCodeTo() {
        return this.uomByUomUomCodeTo;
    }
    
    public void setUomByUomUomCodeTo(Uom uomByUomUomCodeTo) {
        this.uomByUomUomCodeTo = uomByUomUomCodeTo;
    }
    public Float getMultipliedBy() {
        return this.multipliedBy;
    }
    
    public void setMultipliedBy(Float multipliedBy) {
        this.multipliedBy = multipliedBy;
    }
    public Float getDividedBy() {
        return this.dividedBy;
    }
    
    public void setDividedBy(Float dividedBy) {
        this.dividedBy = dividedBy;
    }
    public String getUomConversioncol() {
        return this.uomConversioncol;
    }
    
    public void setUomConversioncol(String uomConversioncol) {
        this.uomConversioncol = uomConversioncol;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public Integer getCreatedUser() {
        return this.createdUser;
    }
    
    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    public Date getModifiedTime() {
        return this.modifiedTime;
    }
    
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public Integer getModifiedUser() {
        return this.modifiedUser;
    }
    
    public void setModifiedUser(Integer modifiedUser) {
        this.modifiedUser = modifiedUser;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }




}


