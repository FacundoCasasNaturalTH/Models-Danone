package com.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class InputASN {
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