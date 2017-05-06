package com.servicemaster.entities;
// Generated May 4, 2017 11:08:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Printer generated by hbm2java
 */
public class Printer  implements java.io.Serializable {


     private Integer printerId;
     private String printerName;
     private Date reatedDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remarks;
     private Set subCategoryPrinterses = new HashSet(0);

    public Printer() {
    }

	
    public Printer(String printerName) {
        this.printerName = printerName;
    }
    public Printer(String printerName, Date reatedDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks, Set subCategoryPrinterses) {
       this.printerName = printerName;
       this.reatedDate = reatedDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remarks = remarks;
       this.subCategoryPrinterses = subCategoryPrinterses;
    }
   
    public Integer getPrinterId() {
        return this.printerId;
    }
    
    public void setPrinterId(Integer printerId) {
        this.printerId = printerId;
    }
    public String getPrinterName() {
        return this.printerName;
    }
    
    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }
    public Date getReatedDate() {
        return this.reatedDate;
    }
    
    public void setReatedDate(Date reatedDate) {
        this.reatedDate = reatedDate;
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
    public Set getSubCategoryPrinterses() {
        return this.subCategoryPrinterses;
    }
    
    public void setSubCategoryPrinterses(Set subCategoryPrinterses) {
        this.subCategoryPrinterses = subCategoryPrinterses;
    }




}

