package com.servicemaster.entities;
// Generated May 31, 2017 1:24:12 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SubCategoryType generated by hbm2java
 */
public class SubCategoryType  implements java.io.Serializable {


     private String subCategoryTypeCode;
     private String subCategoryTypeName;
     private String remark;
     private Date createDate;
     private Date createTime;
     private Integer createUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private Set subCategories = new HashSet(0);

    public SubCategoryType() {
    }

	
    public SubCategoryType(String subCategoryTypeCode) {
        this.subCategoryTypeCode = subCategoryTypeCode;
    }
    public SubCategoryType(String subCategoryTypeCode, String subCategoryTypeName, String remark, Date createDate, Date createTime, Integer createUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, Set subCategories) {
       this.subCategoryTypeCode = subCategoryTypeCode;
       this.subCategoryTypeName = subCategoryTypeName;
       this.remark = remark;
       this.createDate = createDate;
       this.createTime = createTime;
       this.createUser = createUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.subCategories = subCategories;
    }
   
    public String getSubCategoryTypeCode() {
        return this.subCategoryTypeCode;
    }
    
    public void setSubCategoryTypeCode(String subCategoryTypeCode) {
        this.subCategoryTypeCode = subCategoryTypeCode;
    }
    public String getSubCategoryTypeName() {
        return this.subCategoryTypeName;
    }
    
    public void setSubCategoryTypeName(String subCategoryTypeName) {
        this.subCategoryTypeName = subCategoryTypeName;
    }
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
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
    public Set getSubCategories() {
        return this.subCategories;
    }
    
    public void setSubCategories(Set subCategories) {
        this.subCategories = subCategories;
    }




}


