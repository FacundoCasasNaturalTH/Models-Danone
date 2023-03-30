package com.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Detail {
    private String sscc;
    private String batch;
    private String supplierBatch;
    private String quantityInBasicUnit;
    private String asicUnit;

    @JsonProperty("sscc")
    public String getSscc() { return sscc; }
    @JsonProperty("sscc")
    public void setSscc(String value) { this.sscc = value; }

    @JsonProperty("batch")
    public String getBatch() { return batch; }
    @JsonProperty("batch")
    public void setBatch(String value) { this.batch = value; }

    @JsonProperty("supplierBatch")
    public String getSupplierBatch() { return supplierBatch; }
    @JsonProperty("supplierBatch")
    public void setSupplierBatch(String value) { this.supplierBatch = value; }

    @JsonProperty("quantityInBasicUnit")
    public String getQuantityInBasicUnit() { return quantityInBasicUnit; }
    @JsonProperty("quantityInBasicUnit")
    public void setQuantityInBasicUnit(String value) { this.quantityInBasicUnit = value; }

    @JsonProperty("asicUnit")
    public String getASICUnit() { return asicUnit; }
    @JsonProperty("asicUnit")
    public void setASICUnit(String value) { this.asicUnit = value; }
}
