package com.servicemaster.models;
// Generated Sep 8, 2017 12:30:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SubCategory generated by hbm2java
 */
public class SubCategory  implements java.io.Serializable {


     private String subCategoryCode;
     private Category category;
     private Printer printer;
     private SubCategoryType subCategoryType;
     private String subCategoryName;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;
     private Set items = new HashSet(0);

    public SubCategory() {
    }

	
    public SubCategory(String subCategoryCode, Category category, Printer printer, SubCategoryType subCategoryType) {
        this.subCategoryCode = subCategoryCode;
        this.category = category;
        this.printer = printer;
        this.subCategoryType = subCategoryType;
    }
    public SubCategory(String subCategoryCode, Category category, Printer printer, SubCategoryType subCategoryType, String subCategoryName, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks, Set items) {
       this.subCategoryCode = subCategoryCode;
       this.category = category;
       this.printer = printer;
       this.subCategoryType = subCategoryType;
       this.subCategoryName = subCategoryName;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
       this.items = items;
    }
   
    public String getSubCategoryCode() {
        return this.subCategoryCode;
    }
    
    public void setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public Printer getPrinter() {
        return this.printer;
    }
    
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    public SubCategoryType getSubCategoryType() {
        return this.subCategoryType;
    }
    
    public void setSubCategoryType(SubCategoryType subCategoryType) {
        this.subCategoryType = subCategoryType;
    }
    public String getSubCategoryName() {
        return this.subCategoryName;
    }
    
    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
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
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


