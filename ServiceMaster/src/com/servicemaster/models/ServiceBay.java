package com.servicemaster.models;
// Generated Sep 2, 2017 1:38:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ServiceBay generated by hbm2java
 */
public class ServiceBay  implements java.io.Serializable {


     private String serviceBayCode;
     private String serviceBayName;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set services = new HashSet(0);

    public ServiceBay() {
    }

	
    public ServiceBay(String serviceBayCode) {
        this.serviceBayCode = serviceBayCode;
    }
    public ServiceBay(String serviceBayCode, String serviceBayName, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set services) {
       this.serviceBayCode = serviceBayCode;
       this.serviceBayName = serviceBayName;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.services = services;
    }
   
    public String getServiceBayCode() {
        return this.serviceBayCode;
    }
    
    public void setServiceBayCode(String serviceBayCode) {
        this.serviceBayCode = serviceBayCode;
    }
    public String getServiceBayName() {
        return this.serviceBayName;
    }
    
    public void setServiceBayName(String serviceBayName) {
        this.serviceBayName = serviceBayName;
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
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Set getServices() {
        return this.services;
    }
    
    public void setServices(Set services) {
        this.services = services;
    }




}


