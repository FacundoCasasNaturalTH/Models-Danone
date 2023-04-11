package com.PostGoodIssue.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLine {

    private String productNumber;
    private String qtyInBasicUnit;
    private String basicUnit;
    private String qtyInDeliveryUnit;
    private String quantity;
    private String batch;
    private String expiryDate;
    private String sscc;

    @JsonProperty("productNumber")
    public String getProductNumber() {
        return productNumber;
    }
    @JsonProperty("productNumber")
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    @JsonProperty("qtyInBasicUnit")
    public String getQtyInBasicUnit() {
        return qtyInBasicUnit;
    }
    @JsonProperty("qtyInBasicUnit")
    public void setQtyInBasicUnit(String qtyInBasicUnit) {
        this.qtyInBasicUnit = qtyInBasicUnit;
    }

    @JsonProperty("basicUnit")
    public String getBasicUnit() {
        return basicUnit;
    }
    @JsonProperty("basicUnit")
    public void setBasicUnit(String basicUnit) {
        this.basicUnit = basicUnit;
    }

    @JsonProperty("qtyInDeliveryUnit")
    public String getQtyInDeliveryUnit() {
        return qtyInDeliveryUnit;
    }
    @JsonProperty("qtyInDeliveryUnit")
    public void setQtyInDeliveryUnit(String qtyInDeliveryUnit) {
        this.qtyInDeliveryUnit = qtyInDeliveryUnit;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }
    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("batch")
    public String getBatch() {
        return batch;
    }
    @JsonProperty("batch")
    public void setBatch(String batch) {
        this.batch = batch;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }
    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("sscc")
    public String getSscc() {
        return sscc;
    }
    @JsonProperty("sscc")
    public void setSscc(String sscc) {
        this.sscc = sscc;
    } 
}
