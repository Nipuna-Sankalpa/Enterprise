package com.servicemaster.models;
// Generated Sep 11, 2017 10:23:59 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * IssueMethod generated by hbm2java
 */
public class IssueMethod  implements java.io.Serializable {


     private Integer issueMethodId;
     private String issueMethodCode;
     private String issueMethodDesciption;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set items = new HashSet(0);

    public IssueMethod() {
    }

    public IssueMethod(String issueMethodCode, String issueMethodDesciption, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set items) {
       this.issueMethodCode = issueMethodCode;
       this.issueMethodDesciption = issueMethodDesciption;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.items = items;
    }
   
    public Integer getIssueMethodId() {
        return this.issueMethodId;
    }
    
    public void setIssueMethodId(Integer issueMethodId) {
        this.issueMethodId = issueMethodId;
    }
    public String getIssueMethodCode() {
        return this.issueMethodCode;
    }
    
    public void setIssueMethodCode(String issueMethodCode) {
        this.issueMethodCode = issueMethodCode;
    }
    public String getIssueMethodDesciption() {
        return this.issueMethodDesciption;
    }
    
    public void setIssueMethodDesciption(String issueMethodDesciption) {
        this.issueMethodDesciption = issueMethodDesciption;
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


