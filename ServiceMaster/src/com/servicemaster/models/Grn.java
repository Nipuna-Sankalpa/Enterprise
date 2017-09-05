package com.servicemaster.models;
// Generated Sep 5, 2017 11:15:37 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Grn generated by hbm2java
 */
public class Grn  implements java.io.Serializable {


     private String grnCode;
     private String grnNumber;
     private Date grnTime;
     private Date grnDate;
     private String handedOverBy;
     private String batch;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date midifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set stocks = new HashSet(0);

    public Grn() {
    }

	
    public Grn(String grnCode, String grnNumber) {
        this.grnCode = grnCode;
        this.grnNumber = grnNumber;
    }
    public Grn(String grnCode, String grnNumber, Date grnTime, Date grnDate, String handedOverBy, String batch, Date createdDate, Date createdTime, Integer createdUser, Date midifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set stocks) {
       this.grnCode = grnCode;
       this.grnNumber = grnNumber;
       this.grnTime = grnTime;
       this.grnDate = grnDate;
       this.handedOverBy = handedOverBy;
       this.batch = batch;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.midifiedDate = midifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.stocks = stocks;
    }
   
    public String getGrnCode() {
        return this.grnCode;
    }
    
    public void setGrnCode(String grnCode) {
        this.grnCode = grnCode;
    }
    public String getGrnNumber() {
        return this.grnNumber;
    }
    
    public void setGrnNumber(String grnNumber) {
        this.grnNumber = grnNumber;
    }
    public Date getGrnTime() {
        return this.grnTime;
    }
    
    public void setGrnTime(Date grnTime) {
        this.grnTime = grnTime;
    }
    public Date getGrnDate() {
        return this.grnDate;
    }
    
    public void setGrnDate(Date grnDate) {
        this.grnDate = grnDate;
    }
    public String getHandedOverBy() {
        return this.handedOverBy;
    }
    
    public void setHandedOverBy(String handedOverBy) {
        this.handedOverBy = handedOverBy;
    }
    public String getBatch() {
        return this.batch;
    }
    
    public void setBatch(String batch) {
        this.batch = batch;
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
    public Date getMidifiedDate() {
        return this.midifiedDate;
    }
    
    public void setMidifiedDate(Date midifiedDate) {
        this.midifiedDate = midifiedDate;
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
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }




}


