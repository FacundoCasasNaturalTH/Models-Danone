package com.PostGoodIssue.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputPostGoodIssue {
    private String linum;
    private String dlief;
    private String werks;
    private String num;
    private String meins;
    private String lgmng;
    private String vrkme;
    private String glief1;
    private String prodlot;
    private String expiry;
    private String sscc;

    @JsonProperty("LINUM")
    public String getLinum() {
        return linum;
    }
    @JsonProperty("LINUM")
    public void setLinum(String linum) {
        this.linum = linum;
    }

    @JsonProperty("DLIEF")
    public String getDlief() {
        return dlief;
    }
    @JsonProperty("DLIEF")
    public void setDlief(String dlief) {
        this.dlief = dlief;
    }

    @JsonProperty("WERKS")
    public String getWerks() {
        return werks;
    }
    @JsonProperty("WERKS")
    public void setWerks(String werks) {
        this.werks = werks;
    }

    @JsonProperty("NUM")
    public String getNum() {
        return num;
    }
    @JsonProperty("NUM")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("MEINS")
    public String getMeins() {
        return meins;
    }
    @JsonProperty("MEINS")
    public void setMeins(String meins) {
        this.meins = meins;
    }

    @JsonProperty("LGMNG")
    public String getLgmng() {
        return lgmng;
    }
    @JsonProperty("LGMNG")
    public void setLgmng(String lgmng) {
        this.lgmng = lgmng;
    }

    @JsonProperty("VRKME")
    public String getVrkme() {
        return vrkme;
    }
    @JsonProperty("VRKME")
    public void setVrkme(String vrkme) {
        this.vrkme = vrkme;
    }

    @JsonProperty("GLIEF1")
    public String getGlief1() {
        return glief1;
    }
    @JsonProperty("GLIEF1")
    public void setGlief1(String glief1) {
        this.glief1 = glief1;
    }

    @JsonProperty("PRODLOT")
    public String getProdlot() {
        return prodlot;
    }
    @JsonProperty("PRODLOT")
    public void setProdlot(String prodlot) {
        this.prodlot = prodlot;
    }

    @JsonProperty("EXPIRY")
    public String getExpiry() {
        return expiry;
    }
    @JsonProperty("EXPIRY")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @JsonProperty("SSCC")
    public String getSscc() {
        return sscc;
    }
    @JsonProperty("SSCC")
    public void setSscc(String sscc) {
        this.sscc = sscc;
    }
}