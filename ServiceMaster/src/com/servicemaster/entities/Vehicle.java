package com.servicemaster.entities;
// Generated May 7, 2017 7:35:27 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vehicle generated by hbm2java
 */
public class Vehicle implements java.io.Serializable {

    private int vehicleId;
    private BusinessPartner businessPartner;
    private String vehicleNumber;
    private String manufactureredYear;
    private String vehicleType;
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

    public Vehicle(int vehicleId, BusinessPartner businessPartner) {
        this.vehicleId = vehicleId;
        this.businessPartner = businessPartner;
    }

    public Vehicle(int vehicleId, BusinessPartner businessPartner, String vehicleNumber, String manufactureredYear, String vehicleType, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set services) {
        this.vehicleId = vehicleId;
        this.businessPartner = businessPartner;
        this.vehicleNumber = vehicleNumber;
        this.manufactureredYear = manufactureredYear;
        this.vehicleType = vehicleType;
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

    public int getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }

    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
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

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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
