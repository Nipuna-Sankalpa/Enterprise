package com.servicemaster.models;
// Generated Aug 10, 2017 10:50:26 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private String itemCode;
     private RackSlot rackSlot;
     private SubCategory subCategory;
     private Uom uomByBuyingUom;
     private Uom uomBySellingUom;
     private String itemName;
     private Float sellingPrice;
     private String issueMethod;
     private Float reorderQuantity;
     private Integer isPhysical;
     private Integer isActive;
     private Date creadetDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set grnLines = new HashSet(0);
     private Set boms = new HashSet(0);
     private Set manufacturers = new HashSet(0);
     private Set serviceHasItems = new HashSet(0);
     private Set bomItems = new HashSet(0);

    public Item() {
    }

	
    public Item(String itemCode, RackSlot rackSlot, SubCategory subCategory, Uom uomByBuyingUom, Uom uomBySellingUom, String itemName) {
        this.itemCode = itemCode;
        this.rackSlot = rackSlot;
        this.subCategory = subCategory;
        this.uomByBuyingUom = uomByBuyingUom;
        this.uomBySellingUom = uomBySellingUom;
        this.itemName = itemName;
    }
    public Item(String itemCode, RackSlot rackSlot, SubCategory subCategory, Uom uomByBuyingUom, Uom uomBySellingUom, String itemName, Float sellingPrice, String issueMethod, Float reorderQuantity, Integer isPhysical, Integer isActive, Date creadetDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set grnLines, Set boms, Set manufacturers, Set serviceHasItems, Set bomItems) {
       this.itemCode = itemCode;
       this.rackSlot = rackSlot;
       this.subCategory = subCategory;
       this.uomByBuyingUom = uomByBuyingUom;
       this.uomBySellingUom = uomBySellingUom;
       this.itemName = itemName;
       this.sellingPrice = sellingPrice;
       this.issueMethod = issueMethod;
       this.reorderQuantity = reorderQuantity;
       this.isPhysical = isPhysical;
       this.isActive = isActive;
       this.creadetDate = creadetDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.grnLines = grnLines;
       this.boms = boms;
       this.manufacturers = manufacturers;
       this.serviceHasItems = serviceHasItems;
       this.bomItems = bomItems;
    }
   
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public RackSlot getRackSlot() {
        return this.rackSlot;
    }
    
    public void setRackSlot(RackSlot rackSlot) {
        this.rackSlot = rackSlot;
    }
    public SubCategory getSubCategory() {
        return this.subCategory;
    }
    
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
    public Uom getUomByBuyingUom() {
        return this.uomByBuyingUom;
    }
    
    public void setUomByBuyingUom(Uom uomByBuyingUom) {
        this.uomByBuyingUom = uomByBuyingUom;
    }
    public Uom getUomBySellingUom() {
        return this.uomBySellingUom;
    }
    
    public void setUomBySellingUom(Uom uomBySellingUom) {
        this.uomBySellingUom = uomBySellingUom;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
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
    public Float getReorderQuantity() {
        return this.reorderQuantity;
    }
    
    public void setReorderQuantity(Float reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
    public Integer getIsPhysical() {
        return this.isPhysical;
    }
    
    public void setIsPhysical(Integer isPhysical) {
        this.isPhysical = isPhysical;
    }
    public Integer getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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
    public Set getBoms() {
        return this.boms;
    }
    
    public void setBoms(Set boms) {
        this.boms = boms;
    }
    public Set getManufacturers() {
        return this.manufacturers;
    }
    
    public void setManufacturers(Set manufacturers) {
        this.manufacturers = manufacturers;
    }
    public Set getServiceHasItems() {
        return this.serviceHasItems;
    }
    
    public void setServiceHasItems(Set serviceHasItems) {
        this.serviceHasItems = serviceHasItems;
    }
    public Set getBomItems() {
        return this.bomItems;
    }
    
    public void setBomItems(Set bomItems) {
        this.bomItems = bomItems;
    }




}


