package com.servicemaster.entities;
// Generated May 4, 2017 11:08:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TelephoneNumber generated by hbm2java
 */
public class TelephoneNumber  implements java.io.Serializable {


     private Integer telephoneNumberId;
     private String telephoneNumber;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;
     private Set businessTelephones = new HashSet(0);

    public TelephoneNumber() {
    }

    public TelephoneNumber(String telephoneNumber, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks, Set businessTelephones) {
       this.telephoneNumber = telephoneNumber;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
       this.businessTelephones = businessTelephones;
    }
   
    public Integer getTelephoneNumberId() {
        return this.telephoneNumberId;
    }
    
    public void setTelephoneNumberId(Integer telephoneNumberId) {
        this.telephoneNumberId = telephoneNumberId;
    }
    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }
    
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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
    public Set getBusinessTelephones() {
        return this.businessTelephones;
    }
    
    public void setBusinessTelephones(Set businessTelephones) {
        this.businessTelephones = businessTelephones;
    }




}

