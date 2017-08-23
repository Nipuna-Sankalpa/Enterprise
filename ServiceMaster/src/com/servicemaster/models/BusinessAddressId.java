package com.servicemaster.models;
// Generated Aug 23, 2017 10:07:01 PM by Hibernate Tools 4.3.1



/**
 * BusinessAddressId generated by hbm2java
 */
public class BusinessAddressId  implements java.io.Serializable {


     private String addressAddressCode;
     private String businessPartnerBusinessPartnerCode;

    public BusinessAddressId() {
    }

    public BusinessAddressId(String addressAddressCode, String businessPartnerBusinessPartnerCode) {
       this.addressAddressCode = addressAddressCode;
       this.businessPartnerBusinessPartnerCode = businessPartnerBusinessPartnerCode;
    }
   
    public String getAddressAddressCode() {
        return this.addressAddressCode;
    }
    
    public void setAddressAddressCode(String addressAddressCode) {
        this.addressAddressCode = addressAddressCode;
    }
    public String getBusinessPartnerBusinessPartnerCode() {
        return this.businessPartnerBusinessPartnerCode;
    }
    
    public void setBusinessPartnerBusinessPartnerCode(String businessPartnerBusinessPartnerCode) {
        this.businessPartnerBusinessPartnerCode = businessPartnerBusinessPartnerCode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BusinessAddressId) ) return false;
		 BusinessAddressId castOther = ( BusinessAddressId ) other; 
         
		 return ( (this.getAddressAddressCode()==castOther.getAddressAddressCode()) || ( this.getAddressAddressCode()!=null && castOther.getAddressAddressCode()!=null && this.getAddressAddressCode().equals(castOther.getAddressAddressCode()) ) )
 && ( (this.getBusinessPartnerBusinessPartnerCode()==castOther.getBusinessPartnerBusinessPartnerCode()) || ( this.getBusinessPartnerBusinessPartnerCode()!=null && castOther.getBusinessPartnerBusinessPartnerCode()!=null && this.getBusinessPartnerBusinessPartnerCode().equals(castOther.getBusinessPartnerBusinessPartnerCode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAddressAddressCode() == null ? 0 : this.getAddressAddressCode().hashCode() );
         result = 37 * result + ( getBusinessPartnerBusinessPartnerCode() == null ? 0 : this.getBusinessPartnerBusinessPartnerCode().hashCode() );
         return result;
   }   


}


