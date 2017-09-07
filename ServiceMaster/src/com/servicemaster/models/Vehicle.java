package com.servicemaster.models;
// Generated Sep 8, 2017 12:30:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vehicle generated by hbm2java
 */
public class Vehicle  implements java.io.Serializable {


     private String vehicleCode;
     private BusinessPartner businessPartner;
     private VehicleType vehicleType;
     private String vehicleNumber;
     private String manufactureredYear;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set services = new HashSet(0);

    public Vehicle() {
    }

	
    public Vehicle(String vehicleCode, BusinessPartner businessPartner, VehicleType vehicleType, String vehicleNumber) {
        this.vehicleCode = vehicleCode;
        this.businessPartner = businessPartner;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
    public Vehicle(String vehicleCode, BusinessPartner businessPartner, VehicleType vehicleType, String vehicleNumber, String manufactureredYear, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set services) {
       this.vehicleCode = vehicleCode;
       this.businessPartner = businessPartner;
       this.vehicleType = vehicleType;
       this.vehicleNumber = vehicleNumber;
       this.manufactureredYear = manufactureredYear;
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
   
    public String getVehicleCode() {
        return this.vehicleCode;
    }
    
    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }
    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }
    
    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
    
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getVehicleNumber() {
        return this.vehicleNumber;
    }
    
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getManufactureredYear() {
        return this.manufactureredYear;
    }
    
    public void setManufactureredYear(String manufactureredYear) {
        this.manufactureredYear = manufactureredYear;
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


