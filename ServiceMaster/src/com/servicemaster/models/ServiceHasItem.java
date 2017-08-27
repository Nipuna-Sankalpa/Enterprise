package com.servicemaster.models;
// Generated Aug 26, 2017 10:09:18 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ServiceHasItem generated by hbm2java
 */
public class ServiceHasItem  implements java.io.Serializable {


     private Integer id;
     private Item item;
     private Service service;
     private ServiceHasItemStatus serviceHasItemStatus;
     private Float quantity;
     private Float subTotal;
     private Float discount;
     private Float total;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;

    public ServiceHasItem() {
    }

	
    public ServiceHasItem(Item item, Service service) {
        this.item = item;
        this.service = service;
    }
    public ServiceHasItem(Item item, Service service, ServiceHasItemStatus serviceHasItemStatus, Float quantity, Float subTotal, Float discount, Float total, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark) {
       this.item = item;
       this.service = service;
       this.serviceHasItemStatus = serviceHasItemStatus;
       this.quantity = quantity;
       this.subTotal = subTotal;
       this.discount = discount;
       this.total = total;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public Service getService() {
        return this.service;
    }
    
    public void setService(Service service) {
        this.service = service;
    }
    public ServiceHasItemStatus getServiceHasItemStatus() {
        return this.serviceHasItemStatus;
    }
    
    public void setServiceHasItemStatus(ServiceHasItemStatus serviceHasItemStatus) {
        this.serviceHasItemStatus = serviceHasItemStatus;
    }
    public Float getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
    public Float getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }
    public Float getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Float discount) {
        this.discount = discount;
    }
    public Float getTotal() {
        return this.total;
    }
    
    public void setTotal(Float total) {
        this.total = total;
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


