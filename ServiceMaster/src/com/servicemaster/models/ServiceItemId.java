package com.servicemaster.models;
// Generated Jun 4, 2017 11:13:30 AM by Hibernate Tools 4.3.1



/**
 * ServiceItemId generated by hbm2java
 */
public class ServiceItemId  implements java.io.Serializable {


     private String itemItemCode;
     private String serviceServiceCode;

    public ServiceItemId() {
    }

    public ServiceItemId(String itemItemCode, String serviceServiceCode) {
       this.itemItemCode = itemItemCode;
       this.serviceServiceCode = serviceServiceCode;
    }
   
    public String getItemItemCode() {
        return this.itemItemCode;
    }
    
    public void setItemItemCode(String itemItemCode) {
        this.itemItemCode = itemItemCode;
    }
    public String getServiceServiceCode() {
        return this.serviceServiceCode;
    }
    
    public void setServiceServiceCode(String serviceServiceCode) {
        this.serviceServiceCode = serviceServiceCode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ServiceItemId) ) return false;
		 ServiceItemId castOther = ( ServiceItemId ) other; 
         
		 return ( (this.getItemItemCode()==castOther.getItemItemCode()) || ( this.getItemItemCode()!=null && castOther.getItemItemCode()!=null && this.getItemItemCode().equals(castOther.getItemItemCode()) ) )
 && ( (this.getServiceServiceCode()==castOther.getServiceServiceCode()) || ( this.getServiceServiceCode()!=null && castOther.getServiceServiceCode()!=null && this.getServiceServiceCode().equals(castOther.getServiceServiceCode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getItemItemCode() == null ? 0 : this.getItemItemCode().hashCode() );
         result = 37 * result + ( getServiceServiceCode() == null ? 0 : this.getServiceServiceCode().hashCode() );
         return result;
   }   


}


