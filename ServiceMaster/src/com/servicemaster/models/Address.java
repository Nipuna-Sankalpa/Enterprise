package com.servicemaster.models;
// Generated Aug 15, 2017 9:52:50 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private String addressCode;
     private String adressLine1;
     private String adressLine2;
     private String adressLine3;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;
     private Set businessAddresses = new HashSet(0);

    public Address() {
    }

	
    public Address(String addressCode) {
        this.addressCode = addressCode;
    }
    public Address(String addressCode, String adressLine1, String adressLine2, String adressLine3, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks, Set businessAddresses) {
       this.addressCode = addressCode;
       this.adressLine1 = adressLine1;
       this.adressLine2 = adressLine2;
       this.adressLine3 = adressLine3;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
       this.businessAddresses = businessAddresses;
    }
   
    public String getAddressCode() {
        return this.addressCode;
    }
    
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }
    public String getAdressLine1() {
        return this.adressLine1;
    }
    
    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }
    public String getAdressLine2() {
        return this.adressLine2;
    }
    
    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }
    public String getAdressLine3() {
        return this.adressLine3;
    }
    
    public void setAdressLine3(String adressLine3) {
        this.adressLine3 = adressLine3;
    }
    public Integer getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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
    public Set getBusinessAddresses() {
        return this.businessAddresses;
    }
    
    public void setBusinessAddresses(Set businessAddresses) {
        this.businessAddresses = businessAddresses;
    }




}


