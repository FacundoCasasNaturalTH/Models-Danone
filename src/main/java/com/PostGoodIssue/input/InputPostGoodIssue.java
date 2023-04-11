package com.PostGoodIssue.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputPostGoodIssue {
    @JsonProperty
    private String LINUM;
    @JsonProperty
    private String DLIEF;
    @JsonProperty
    private String WERKS;
    @JsonProperty
    private String NUM;
    @JsonProperty
    private String MEINS;
    @JsonProperty
    private String LGMNG;
    @JsonProperty
    private String VRKME;
    @JsonProperty
    private String GLIEF1;
    @JsonProperty
    private String PRODLOT;
    @JsonProperty
    private String EXPIRY;
    @JsonProperty
    private String SSCC;

    public String getLINUM() {
        return LINUM;
    }
    public void setLINUM(String lINUM) {
        this.LINUM = lINUM;
    }
    public String getDLIEF() {
        return DLIEF;
    }
    public void setDLIEF(String dLIEF) {
        this.DLIEF = dLIEF;
    } 
    public String getWERKS() {
        return WERKS;
    }
    public void setWERKS(String wERKS) {
        this.WERKS = wERKS;
    }
    public String getNUM() {
        return NUM;
    }
    public void setNUM(String nUM) {
        this.NUM = nUM;
    }
    public String getMEINS() {
        return MEINS;
    }
    public void setMEINS(String mEINS) {
        this.MEINS = mEINS;
    } 
    public String getLGMNG() {
        return LGMNG;
    }
    public void setLGMNG(String lGMNG) {
        this.LGMNG = lGMNG;
    }
    public String getVRKME() {
        return VRKME;
    }
    public void setVRKME(String vRKME) {
        this.VRKME = vRKME;
    }
    public String getGLIEF1() {
        return GLIEF1;
    }
    public void setGLIEF1(String gLIEF1) {
        this.GLIEF1 = gLIEF1;
    }
    public String getPRODLOT() {
        return PRODLOT;
    }
    public void setPRODLOT(String pRODLOT) {
        this.PRODLOT = pRODLOT;
    }
    public String getEXPIRY() {
        return EXPIRY;
    }
    public void setEXPIRY(String eXPIRY) {
        this.EXPIRY = eXPIRY;
    }
    public String getSSCC() {
        return SSCC;
    }
    public void setSSCC(String sSCC) {
        this.SSCC = sSCC;
    }
}