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

    @JsonProperty("linum")
    public String getLinum() {
        return linum;
    }
    @JsonProperty("linum")
    public void setLinum(String linum) {
        this.linum = linum;
    }

    @JsonProperty("dlief")
    public String getDlief() {
        return dlief;
    }
    @JsonProperty("dlief")
    public void setDlief(String dlief) {
        this.dlief = dlief;
    }

    @JsonProperty("werks")
    public String getWerks() {
        return werks;
    }
    @JsonProperty("werks")
    public void setWerks(String werks) {
        this.werks = werks;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }
    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("meins")
    public String getMeins() {
        return meins;
    }
    @JsonProperty("meins")
    public void setMeins(String meins) {
        this.meins = meins;
    }

    @JsonProperty("lgmng")
    public String getLgmng() {
        return lgmng;
    }
    @JsonProperty("lgmng")
    public void setLgmng(String lgmng) {
        this.lgmng = lgmng;
    }

    @JsonProperty("vrkme")
    public String getVrkme() {
        return vrkme;
    }
    @JsonProperty("vrkme")
    public void setVrkme(String vrkme) {
        this.vrkme = vrkme;
    }

    @JsonProperty("glief1")
    public String getGlief1() {
        return glief1;
    }
    @JsonProperty("glief1")
    public void setGlief1(String glief1) {
        this.glief1 = glief1;
    }

    @JsonProperty("prodlot")
    public String getProdlot() {
        return prodlot;
    }
    @JsonProperty("prodlot")
    public void setProdlot(String prodlot) {
        this.prodlot = prodlot;
    }

    @JsonProperty("expiry")
    public String getExpiry() {
        return expiry;
    }
    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
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