package com.servicemaster.entities;
// Generated May 31, 2017 1:24:12 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer userId;
     private BusinessPartner businessPartner;
     private UserPrivilage userPrivilage;
     private String userName;
     private String password;
     private int userLevel;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date midifiedDate;
     private Date modifiedTime;
     private Integer midifiedUser;
     private String remarks;

    public User() {
    }

	
    public User(BusinessPartner businessPartner, UserPrivilage userPrivilage, String userName, String password, int userLevel) {
        this.businessPartner = businessPartner;
        this.userPrivilage = userPrivilage;
        this.userName = userName;
        this.password = password;
        this.userLevel = userLevel;
    }
    public User(BusinessPartner businessPartner, UserPrivilage userPrivilage, String userName, String password, int userLevel, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date midifiedDate, Date modifiedTime, Integer midifiedUser, String remarks) {
       this.businessPartner = businessPartner;
       this.userPrivilage = userPrivilage;
       this.userName = userName;
       this.password = password;
       this.userLevel = userLevel;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.midifiedDate = midifiedDate;
       this.modifiedTime = modifiedTime;
       this.midifiedUser = midifiedUser;
       this.remarks = remarks;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }
    
    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }
    public UserPrivilage getUserPrivilage() {
        return this.userPrivilage;
    }
    
    public void setUserPrivilage(UserPrivilage userPrivilage) {
        this.userPrivilage = userPrivilage;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getUserLevel() {
        return this.userLevel;
    }
    
    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
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
    public Integer getMidifiedUser() {
        return this.midifiedUser;
    }
    
    public void setMidifiedUser(Integer midifiedUser) {
        this.midifiedUser = midifiedUser;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }




}


