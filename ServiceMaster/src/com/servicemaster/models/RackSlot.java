package com.servicemaster.models;
// Generated Sep 5, 2017 11:15:37 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RackSlot generated by hbm2java
 */
public class RackSlot  implements java.io.Serializable {


     private String rackSlotCode;
     private Rack rack;
     private String rackSlotName;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set items = new HashSet(0);

    public RackSlot() {
    }

	
    public RackSlot(String rackSlotCode, Rack rack) {
        this.rackSlotCode = rackSlotCode;
        this.rack = rack;
    }
    public RackSlot(String rackSlotCode, Rack rack, String rackSlotName, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set items) {
       this.rackSlotCode = rackSlotCode;
       this.rack = rack;
       this.rackSlotName = rackSlotName;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.items = items;
    }
   
    public String getRackSlotCode() {
        return this.rackSlotCode;
    }
    
    public void setRackSlotCode(String rackSlotCode) {
        this.rackSlotCode = rackSlotCode;
    }
    public Rack getRack() {
        return this.rack;
    }
    
    public void setRack(Rack rack) {
        this.rack = rack;
    }
    public String getRackSlotName() {
        return this.rackSlotName;
    }
    
    public void setRackSlotName(String rackSlotName) {
        this.rackSlotName = rackSlotName;
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
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


