package com.servicemaster.models;
// Generated Sep 9, 2017 9:31:25 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VehicleType generated by hbm2java
 */
public class VehicleType  implements java.io.Serializable {


     private String vehicleTypeCode;
     private String vehicleTypeName;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set vehicles = new HashSet(0);

    public VehicleType() {
    }

	
    public VehicleType(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }
    public VehicleType(String vehicleTypeCode, String vehicleTypeName, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set vehicles) {
       this.vehicleTypeCode = vehicleTypeCode;
       this.vehicleTypeName = vehicleTypeName;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.vehicles = vehicles;
    }
   
    public String getVehicleTypeCode() {
        return this.vehicleTypeCode;
    }
    
    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }
    public String getVehicleTypeName() {
        return this.vehicleTypeName;
    }
    
    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
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
    public Set getVehicles() {
        return this.vehicles;
    }
    
    public void setVehicles(Set vehicles) {
        this.vehicles = vehicles;
    }




}


