package com.servicemaster.models;
// Generated Jun 4, 2017 10:24:30 PM by Hibernate Tools 4.3.1

/**
 * BusinessTelephoneId generated by hbm2java
 */
public class BusinessTelephoneId implements java.io.Serializable {

    private String telephoneNumberTelephoneNumberCode;
    private String businessPartnerBusinessPartnerCode;

    public BusinessTelephoneId() {
    }

    public BusinessTelephoneId(String telephoneNumberTelephoneNumberCode, String businessPartnerBusinessPartnerCode) {
        this.telephoneNumberTelephoneNumberCode = telephoneNumberTelephoneNumberCode;
        this.businessPartnerBusinessPartnerCode = businessPartnerBusinessPartnerCode;
    }

    public String getTelephoneNumberTelephoneNumberCode() {
        return this.telephoneNumberTelephoneNumberCode;
    }

    public void setTelephoneNumberTelephoneNumberCode(String telephoneNumberTelephoneNumberCode) {
        this.telephoneNumberTelephoneNumberCode = telephoneNumberTelephoneNumberCode;
    }

    public String getBusinessPartnerBusinessPartnerCode() {
        return this.businessPartnerBusinessPartnerCode;
    }

    public void setBusinessPartnerBusinessPartnerCode(String businessPartnerBusinessPartnerCode) {
        this.businessPartnerBusinessPartnerCode = businessPartnerBusinessPartnerCode;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof BusinessTelephoneId)) {
            return false;
        }
        BusinessTelephoneId castOther = (BusinessTelephoneId) other;

        return ((this.getTelephoneNumberTelephoneNumberCode() == castOther.getTelephoneNumberTelephoneNumberCode()) || (this.getTelephoneNumberTelephoneNumberCode() != null && castOther.getTelephoneNumberTelephoneNumberCode() != null && this.getTelephoneNumberTelephoneNumberCode().equals(castOther.getTelephoneNumberTelephoneNumberCode())))
                && ((this.getBusinessPartnerBusinessPartnerCode() == castOther.getBusinessPartnerBusinessPartnerCode()) || (this.getBusinessPartnerBusinessPartnerCode() != null && castOther.getBusinessPartnerBusinessPartnerCode() != null && this.getBusinessPartnerBusinessPartnerCode().equals(castOther.getBusinessPartnerBusinessPartnerCode())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getTelephoneNumberTelephoneNumberCode() == null ? 0 : this.getTelephoneNumberTelephoneNumberCode().hashCode());
        result = 37 * result + (getBusinessPartnerBusinessPartnerCode() == null ? 0 : this.getBusinessPartnerBusinessPartnerCode().hashCode());
        return result;
    }

}
