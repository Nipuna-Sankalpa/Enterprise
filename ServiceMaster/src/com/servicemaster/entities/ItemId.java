package com.servicemaster.entities;
// Generated May 7, 2017 7:35:27 PM by Hibernate Tools 4.3.1

/**
 * ItemId generated by hbm2java
 */
public class ItemId implements java.io.Serializable {

    private String subCategoryCategoryCategoryCode;
    private String subCategorySubCategoryCode;
    private String itemCode;

    public ItemId() {
    }

    public ItemId(String subCategoryCategoryCategoryCode, String subCategorySubCategoryCode, String itemCode) {
        this.subCategoryCategoryCategoryCode = subCategoryCategoryCategoryCode;
        this.subCategorySubCategoryCode = subCategorySubCategoryCode;
        this.itemCode = itemCode;
    }

    public String getSubCategoryCategoryCategoryCode() {
        return this.subCategoryCategoryCategoryCode;
    }

    public void setSubCategoryCategoryCategoryCode(String subCategoryCategoryCategoryCode) {
        this.subCategoryCategoryCategoryCode = subCategoryCategoryCategoryCode;
    }

    public String getSubCategorySubCategoryCode() {
        return this.subCategorySubCategoryCode;
    }

    public void setSubCategorySubCategoryCode(String subCategorySubCategoryCode) {
        this.subCategorySubCategoryCode = subCategorySubCategoryCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof ItemId)) {
            return false;
        }
        ItemId castOther = (ItemId) other;

        return ((this.getSubCategoryCategoryCategoryCode() == null ? castOther.getSubCategoryCategoryCategoryCode() == null : this.getSubCategoryCategoryCategoryCode().equals(castOther.getSubCategoryCategoryCategoryCode())) || (this.getSubCategoryCategoryCategoryCode() != null && castOther.getSubCategoryCategoryCategoryCode() != null && this.getSubCategoryCategoryCategoryCode().equals(castOther.getSubCategoryCategoryCategoryCode())))
                && ((this.getSubCategorySubCategoryCode() == null ? castOther.getSubCategorySubCategoryCode() == null : this.getSubCategorySubCategoryCode().equals(castOther.getSubCategorySubCategoryCode())) || (this.getSubCategorySubCategoryCode() != null && castOther.getSubCategorySubCategoryCode() != null && this.getSubCategorySubCategoryCode().equals(castOther.getSubCategorySubCategoryCode())))
                && ((this.getItemCode() == null ? castOther.getItemCode() == null : this.getItemCode().equals(castOther.getItemCode())) || (this.getItemCode() != null && castOther.getItemCode() != null && this.getItemCode().equals(castOther.getItemCode())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getSubCategoryCategoryCategoryCode() == null ? 0 : this.getSubCategoryCategoryCategoryCode().hashCode());
        result = 37 * result + (getSubCategorySubCategoryCode() == null ? 0 : this.getSubCategorySubCategoryCode().hashCode());
        result = 37 * result + (getItemCode() == null ? 0 : this.getItemCode().hashCode());
        return result;
    }

}
