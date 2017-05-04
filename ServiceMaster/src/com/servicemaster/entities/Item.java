package com.servicemaster.entities;
// Generated May 4, 2017 11:08:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private int itemId;
     private SubCategory subCategory;
     private String itemCode;
     private String itemName;
     private Integer sellingUom;
     private Integer buyingUom;
     private Float costPrice;
     private Float sellingPrice;
     private String issueMethod;
     private Float quantity;
     private Float reorderQuantity;
     private Date creadetDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set grnLines = new HashSet(0);
     private Set serviceItems = new HashSet(0);
     private Set itemStorages = new HashSet(0);

    public Item() {
    }

	
    public Item(int itemId, SubCategory subCategory, String itemCode, String itemName) {
        this.itemId = itemId;
        this.subCategory = subCategory;
        this.itemCode = itemCode;
        this.itemName = itemName;
    }
    public Item(int itemId, SubCategory subCategory, String itemCode, String itemName, Integer sellingUom, Integer buyingUom, Float costPrice, Float sellingPrice, String issueMethod, Float quantity, Float reorderQuantity, Date creadetDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set grnLines, Set serviceItems, Set itemStorages) {
       this.itemId = itemId;
       this.subCategory = subCategory;
       this.itemCode = itemCode;
       this.itemName = itemName;
       this.sellingUom = sellingUom;
       this.buyingUom = buyingUom;
       this.costPrice = costPrice;
       this.sellingPrice = sellingPrice;
       this.issueMethod = issueMethod;
       this.quantity = quantity;
       this.reorderQuantity = reorderQuantity;
       this.creadetDate = creadetDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.grnLines = grnLines;
       this.serviceItems = serviceItems;
       this.itemStorages = itemStorages;
    }
   
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public SubCategory getSubCategory() {
        return this.subCategory;
    }
    
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getSellingUom() {
        return this.sellingUom;
    }
    
    public void setSellingUom(Integer sellingUom) {
        this.sellingUom = sellingUom;
    }
    public Integer getBuyingUom() {
        return this.buyingUom;
    }
    
    public void setBuyingUom(Integer buyingUom) {
        this.buyingUom = buyingUom;
    }
    public Float getCostPrice() {
        return this.costPrice;
    }
    
    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
    }
    public Float getSellingPrice() {
        return this.sellingPrice;
    }
    
    public void setSellingPrice(Float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public String getIssueMethod() {
        return this.issueMethod;
    }
    
    public void setIssueMethod(String issueMethod) {
        this.issueMethod = issueMethod;
    }
    public Float getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
    public Float getReorderQuantity() {
        return this.reorderQuantity;
    }
    
    public void setReorderQuantity(Float reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
    public Date getCreadetDate() {
        return this.creadetDate;
    }
    
    public void setCreadetDate(Date creadetDate) {
        this.creadetDate = creadetDate;
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
    public Set getGrnLines() {
        return this.grnLines;
    }
    
    public void setGrnLines(Set grnLines) {
        this.grnLines = grnLines;
    }
    public Set getServiceItems() {
        return this.serviceItems;
    }
    
    public void setServiceItems(Set serviceItems) {
        this.serviceItems = serviceItems;
    }
    public Set getItemStorages() {
        return this.itemStorages;
    }
    
    public void setItemStorages(Set itemStorages) {
        this.itemStorages = itemStorages;
    }




}


