package com.servicemaster.models;
// Generated Sep 5, 2017 11:15:37 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StockStatus generated by hbm2java
 */
public class StockStatus  implements java.io.Serializable {


     private int stockStatusCode;
     private String stockStatusName;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set stocks = new HashSet(0);

    public StockStatus() {
    }

	
    public StockStatus(int stockStatusCode) {
        this.stockStatusCode = stockStatusCode;
    }
    public StockStatus(int stockStatusCode, String stockStatusName, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set stocks) {
       this.stockStatusCode = stockStatusCode;
       this.stockStatusName = stockStatusName;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.stocks = stocks;
    }
   
    public int getStockStatusCode() {
        return this.stockStatusCode;
    }
    
    public void setStockStatusCode(int stockStatusCode) {
        this.stockStatusCode = stockStatusCode;
    }
    public String getStockStatusName() {
        return this.stockStatusName;
    }
    
    public void setStockStatusName(String stockStatusName) {
        this.stockStatusName = stockStatusName;
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
    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }




}

