package com.PostGoodIssue.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputPostGoodIssue {
    @JsonProperty("LINUM")
    private String linum;
    @JsonProperty("DLIEF")
    private String dlief;
    @JsonProperty("WERKS")
    private String werks;
    @JsonProperty("NUM")
    private String num;
    @JsonProperty("MEINS")
    private String meins;
    @JsonProperty("LGMNG")
    private String lgmng;
    @JsonProperty("VRKME")
    private String vrkme;
    @JsonProperty("GLIEF1")
    private String glief1;
    @JsonProperty("PRODLOT")
    private String prodlot;
    @JsonProperty("EXPIRY")
    private String expiry;
    @JsonProperty("SSCC")
    private String sscc;

    public String getLinum() {
        return linum;
    }
    public void setLinum(String linum) {
        this.linum = linum;
    }
    public String getDlief() {
        return dlief;
    }
    public void setDlief(String dlief) {
        this.dlief = dlief;
    } 
    public String getWerks() {
        return werks;
    }
    public void setWerks(String werks) {
        this.werks = werks;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getMeins() {
        return meins;
    }
    public void setMeins(String meins) {
        this.meins = meins;
    } 
    public String getLgmng() {
        return lgmng;
    }
    public void setLgmng(String lgmng) {
        this.lgmng = lgmng;
    }
    public String getVrkme() {
        return vrkme;
    }
    public void setVrkme(String vrkme) {
        this.vrkme = vrkme;
    }
    public String getGlief1() {
        return glief1;
    }
    public void setGlief1(String glief1) {
        this.glief1 = glief1;
    }
    public String getProdlot() {
        return prodlot;
    }
    public void setProdlot(String prodlot) {
        this.prodlot = prodlot;
    }
    public String getExpiry() {
        return expiry;
    }
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
    public String getSscc() {
        return sscc;
    }
    public void setSscc(String sscc) {
        this.sscc = sscc;
    }
}