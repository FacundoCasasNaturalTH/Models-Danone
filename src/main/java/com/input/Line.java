package com.input;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Line {
    private String purchaseOrderNumber;
    private String legalNumber;
    private String productNumber;
    private String storageLocation;
    private String quantityInBasicUnit;
    private String basicUnit;
    private String batch;
    private String supplierBatch;
    private String stockType;
    private List<Detail> detail;

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber() { return purchaseOrderNumber; }
    @JsonProperty("purchaseOrderNumber")
    public void setPurchaseOrderNumber(String value) { this.purchaseOrderNumber = value; }

    @JsonProperty("legalNumber")
    public String getLegalNumber() { return legalNumber; }
    @JsonProperty("legalNumber")
    public void setLegalNumber(String value) { this.legalNumber = value; }

    @JsonProperty("productNumber")
    public String getProductNumber() { return productNumber; }
    @JsonProperty("productNumber")
    public void setProductNumber(String value) { this.productNumber = value; }

    @JsonProperty("storageLocation")
    public String getStorageLocation() { return storageLocation; }
    @JsonProperty("storageLocation")
    public void setStorageLocation(String value) { this.storageLocation = value; }

    @JsonProperty("quantityInBasicUnit")
    public String getQuantityInBasicUnit() { return quantityInBasicUnit; }
    @JsonProperty("quantityInBasicUnit")
    public void setQuantityInBasicUnit(String value) { this.quantityInBasicUnit = value; }

    @JsonProperty("basicUnit")
    public String getBasicUnit() { return basicUnit; }
    @JsonProperty("basicUnit")
    public void setBasicUnit(String value) { this.basicUnit = value; }

    @JsonProperty("batch")
    public String getBatch() { return batch; }
    @JsonProperty("batch")
    public void setBatch(String value) { this.batch = value; }

    @JsonProperty("supplierBatch")
    public String getSupplierBatch() { return supplierBatch; }
    @JsonProperty("supplierBatch")
    public void setSupplierBatch(String value) { this.supplierBatch = value; }

    @JsonProperty("stockType")
    public String getStockType() { return stockType; }
    @JsonProperty("stockType")
    public void setStockType(String value) { this.stockType = value; }

    @JsonProperty("detail")
    public List<Detail> getDetail() { return detail; }
    @JsonProperty("detail")
    public void setDetail(List<Detail> value) { this.detail = value; }
}
