package com.servicemaster.models;
// Generated Oct 1, 2017 7:12:27 PM by Hibernate Tools 4.3.1



/**
 * SaleBusinessPartner generated by hbm2java
 */
public class SaleBusinessPartner  implements java.io.Serializable {


     private SaleBusinessPartnerId id;
     private BusinessPartner businessPartner;
     private Sale sale;

    public SaleBusinessPartner() {
    }

    public SaleBusinessPartner(SaleBusinessPartnerId id, BusinessPartner businessPartner, Sale sale) {
       this.id = id;
       this.businessPartner = businessPartner;
       this.sale = sale;
    }
   
    public SaleBusinessPartnerId getId() {
        return this.id;
    }
    
    public void setId(SaleBusinessPartnerId id) {
        this.id = id;
    }
    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }
    
    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }
    public Sale getSale() {
        return this.sale;
    }
    
    public void setSale(Sale sale) {
        this.sale = sale;
    }




}

