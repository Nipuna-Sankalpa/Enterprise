package com.servicemaster.entities;
// Generated May 4, 2017 11:08:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Billing generated by hbm2java
 */
public class Billing  implements java.io.Serializable {


     private int billingId;
     private BusinessPartner businessPartner;
     private Service service;
     private Float netAmount;
     private Float discount;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private Set billingLines = new HashSet(0);

    public Billing() {
    }

	
    public Billing(int billingId, BusinessPartner businessPartner, Service service) {
        this.billingId = billingId;
        this.businessPartner = businessPartner;
        this.service = service;
    }
    public Billing(int billingId, BusinessPartner businessPartner, Service service, Float netAmount, Float discount, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, Set billingLines) {
       this.billingId = billingId;
       this.businessPartner = businessPartner;
       this.service = service;
       this.netAmount = netAmount;
       this.discount = discount;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.billingLines = billingLines;
    }
   
    public int getBillingId() {
        return this.billingId;
    }
    
    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }
    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }
    
    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }
    public Service getService() {
        return this.service;
    }
    
    public void setService(Service service) {
        this.service = service;
    }
    public Float getNetAmount() {
        return this.netAmount;
    }
    
    public void setNetAmount(Float netAmount) {
        this.netAmount = netAmount;
    }
    public Float getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Float discount) {
        this.discount = discount;
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
    public Set getBillingLines() {
        return this.billingLines;
    }
    
    public void setBillingLines(Set billingLines) {
        this.billingLines = billingLines;
    }




}

