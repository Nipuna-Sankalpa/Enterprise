package com.servicemaster.models;
// Generated Sep 11, 2017 10:23:59 AM by Hibernate Tools 4.3.1



/**
 * License generated by hbm2java
 */
public class License  implements java.io.Serializable {


     private int id;
     private String companyName;
     private String addressLine1;
     private String addressLine2;
     private String addressLine3;
     private String telephone;
     private String fax;
     private String email;
     private String web;
     private String vatNumber;

    public License() {
    }

	
    public License(int id) {
        this.id = id;
    }
    public License(int id, String companyName, String addressLine1, String addressLine2, String addressLine3, String telephone, String fax, String email, String web, String vatNumber) {
       this.id = id;
       this.companyName = companyName;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.addressLine3 = addressLine3;
       this.telephone = telephone;
       this.fax = fax;
       this.email = email;
       this.web = web;
       this.vatNumber = vatNumber;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getAddressLine3() {
        return this.addressLine3;
    }
    
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWeb() {
        return this.web;
    }
    
    public void setWeb(String web) {
        this.web = web;
    }
    public String getVatNumber() {
        return this.vatNumber;
    }
    
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }




}


