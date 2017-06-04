package com.servicemaster.models;
// Generated Jun 4, 2017 10:24:30 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TelephoneNumber generated by hbm2java
 */
public class TelephoneNumber implements java.io.Serializable {

    private String telephoneNumberCode;
    private String telephoneNumber;
    private Integer isActive;
    private Date createdDate;
    private Date createdTime;
    private Integer createdUser;
    private Date modifiedDate;
    private Date modifiedTime;
    private Integer modifiedUser;
    private String remarks;
    private Set businessTelephones = new HashSet(0);

    public TelephoneNumber() {
    }

    public TelephoneNumber(String telephoneNumberCode) {
        this.telephoneNumberCode = telephoneNumberCode;
    }

    public TelephoneNumber(String telephoneNumberCode, String telephoneNumber, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remarks, Set businessTelephones) {
        this.telephoneNumberCode = telephoneNumberCode;
        this.telephoneNumber = telephoneNumber;
        this.isActive = isActive;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdUser = createdUser;
        this.modifiedDate = modifiedDate;
        this.modifiedTime = modifiedTime;
        this.modifiedUser = modifiedUser;
        this.remarks = remarks;
        this.businessTelephones = businessTelephones;
    }

    public String getTelephoneNumberCode() {
        return this.telephoneNumberCode;
    }

    public void setTelephoneNumberCode(String telephoneNumberCode) {
        this.telephoneNumberCode = telephoneNumberCode;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Set getBusinessTelephones() {
        return this.businessTelephones;
    }

    public void setBusinessTelephones(Set businessTelephones) {
        this.businessTelephones = businessTelephones;
    }

}
