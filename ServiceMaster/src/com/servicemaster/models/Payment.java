package com.servicemaster.models;
// Generated Jul 26, 2017 11:33:46 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Payment generated by hbm2java
 */
public class Payment  implements java.io.Serializable {


     private String paymentCode;
     private PaymentType paymentType;
     private Invoice invoice;
     private Float amount;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;

    public Payment() {
    }

	
    public Payment(String paymentCode, PaymentType paymentType, Invoice invoice) {
        this.paymentCode = paymentCode;
        this.paymentType = paymentType;
        this.invoice = invoice;
    }
    public Payment(String paymentCode, PaymentType paymentType, Invoice invoice, Float amount, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark) {
       this.paymentCode = paymentCode;
       this.paymentType = paymentType;
       this.invoice = invoice;
       this.amount = amount;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
    }
   
    public String getPaymentCode() {
        return this.paymentCode;
    }
    
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
    public PaymentType getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Float getAmount() {
        return this.amount;
    }
    
    public void setAmount(Float amount) {
        this.amount = amount;
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




}

