package com;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class UserASN {
    private String asnNumber;
    private String asnDocumentDate;
    private String deliveryNumber;
    private String plannedDeliveryDate;
    private String shipmentID;
    private String shippingDate;
    private String shipFromLocation;
    private String shipToLocation;
    private String forwardingAgent;
    private List<Line> line;

    @JsonProperty("asnNumber")
    public String getAsnNumber() { return asnNumber; }
    @JsonProperty("asnNumber")
    public void setAsnNumber(String value) { this.asnNumber = value; }

    @JsonProperty("asnDocumentDate")
    public String getAsnDocumentDate() { return asnDocumentDate; }
    @JsonProperty("asnDocumentDate")
    public void setAsnDocumentDate(String value) { this.asnDocumentDate = value; }

    @JsonProperty("deliveryNumber")
    public String getDeliveryNumber() { return deliveryNumber; }
    @JsonProperty("deliveryNumber")
    public void setDeliveryNumber(String value) { this.deliveryNumber = value; }

    @JsonProperty("plannedDeliveryDate")
    public String getPlannedDeliveryDate() { return plannedDeliveryDate; }
    @JsonProperty("plannedDeliveryDate")
    public void setPlannedDeliveryDate(String value) { this.plannedDeliveryDate = value; }

    @JsonProperty("shipmentID")
    public String getShipmentID() { return shipmentID; }
    @JsonProperty("shipmentID")
    public void setShipmentID(String value) { this.shipmentID = value; }

    @JsonProperty("shippingDate")
    public String getShippingDate() { return shippingDate; }
    @JsonProperty("shippingDate")
    public void setShippingDate(String value) { this.shippingDate = value; }

    @JsonProperty("shipFromLocation")
    public String getShipFromLocation() { return shipFromLocation; }
    @JsonProperty("shipFromLocation")
    public void setShipFromLocation(String value) { this.shipFromLocation = value; }

    @JsonProperty("shipToLocation")
    public String getShipToLocation() { return shipToLocation; }
    @JsonProperty("shipToLocation")
    public void setShipToLocation(String value) { this.shipToLocation = value; }

    @JsonProperty("forwardingAgent")
    public String getForwardingAgent() { return forwardingAgent; }
    @JsonProperty("forwardingAgent")
    public void setForwardingAgent(String value) { this.forwardingAgent = value; }

    @JsonProperty("line")
    public List<Line> getLine() { return line; }
    @JsonProperty("line")
    public void setLine(List<Line> value) { this.line = value; }
}

 class Line {
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


class Detail {
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
