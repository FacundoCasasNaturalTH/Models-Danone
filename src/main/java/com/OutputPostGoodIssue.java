package com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.input.LinePostGoodIssue;

public class OutputPostGoodIssue {
    @JsonProperty
    private String deliveryNumber;
    @JsonProperty
    private String shipmentDate;
    @JsonProperty
    private String shipmentID;
    @JsonProperty
    private String plantCode;
    @JsonProperty
    private List<LinePostGoodIssue> line;

    public String getDeliveryNumber() {
        return deliveryNumber;
    }
    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
    public String getShipmentDate() {
        return shipmentDate;
    }
    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }
    public String getShipmentID() {
        return shipmentID;
    }
    public void setShipmentID(String shipmentID) {
        this.shipmentID = shipmentID;
    }
    public String getPlantCode() {
        return plantCode;
    }
    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }
    public List<LinePostGoodIssue> getLine() {
        return line;
    }
    public void setLine(List<LinePostGoodIssue> line) {
        this.line = line;
    }  
}

