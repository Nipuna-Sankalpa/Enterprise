package com.servicemaster.models;
// Generated Sep 5, 2017 11:15:37 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private String stockCode;
     private Grn grn;
     private Item item;
     private StockStatus stockStatus;
     private Float unitPrice;
     private Float receivedQuantity;
     private Float totalPrice;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private int grnGrnId;

    public Stock() {
    }

	
    public Stock(String stockCode, Grn grn, Item item, StockStatus stockStatus, int grnGrnId) {
        this.stockCode = stockCode;
        this.grn = grn;
        this.item = item;
        this.stockStatus = stockStatus;
        this.grnGrnId = grnGrnId;
    }
    public Stock(String stockCode, Grn grn, Item item, StockStatus stockStatus, Float unitPrice, Float receivedQuantity, Float totalPrice, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, int grnGrnId) {
       this.stockCode = stockCode;
       this.grn = grn;
       this.item = item;
       this.stockStatus = stockStatus;
       this.unitPrice = unitPrice;
       this.receivedQuantity = receivedQuantity;
       this.totalPrice = totalPrice;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.grnGrnId = grnGrnId;
    }
   
    public String getStockCode() {
        return this.stockCode;
    }
    
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    public Grn getGrn() {
        return this.grn;
    }
    
    public void setGrn(Grn grn) {
        this.grn = grn;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public StockStatus getStockStatus() {
        return this.stockStatus;
    }
    
    public void setStockStatus(StockStatus stockStatus) {
        this.stockStatus = stockStatus;
    }
    public Float getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Float getReceivedQuantity() {
        return this.receivedQuantity;
    }
    
    public void setReceivedQuantity(Float receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
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
    public int getGrnGrnId() {
        return this.grnGrnId;
    }
    
    public void setGrnGrnId(int grnGrnId) {
        this.grnGrnId = grnGrnId;
    }




}

