package com.servicemaster.models;
// Generated Aug 14, 2017 3:57:16 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Module generated by hbm2java
 */
public class Module  implements java.io.Serializable {


     private int moduleId;
     private String moduleCode;
     private String moduleName;
     private String iconName;
     private Integer isShortcutAdded;
     private Integer isActive;
     private Integer isMaximized;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;

    public Module() {
    }

	
    public Module(int moduleId, String moduleCode) {
        this.moduleId = moduleId;
        this.moduleCode = moduleCode;
    }
    public Module(int moduleId, String moduleCode, String moduleName, String iconName, Integer isShortcutAdded, Integer isActive, Integer isMaximized, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks) {
       this.moduleId = moduleId;
       this.moduleCode = moduleCode;
       this.moduleName = moduleName;
       this.iconName = iconName;
       this.isShortcutAdded = isShortcutAdded;
       this.isActive = isActive;
       this.isMaximized = isMaximized;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
    }
   
    public int getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }
    
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getIconName() {
        return this.iconName;
    }
    
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public Integer getIsShortcutAdded() {
        return this.isShortcutAdded;
    }
    
    public void setIsShortcutAdded(Integer isShortcutAdded) {
        this.isShortcutAdded = isShortcutAdded;
    }
    public Integer getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    public Integer getIsMaximized() {
        return this.isMaximized;
    }
    
    public void setIsMaximized(Integer isMaximized) {
        this.isMaximized = isMaximized;
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


