package com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutputASN {
    @JsonProperty
    private String field_chr1;
    @JsonProperty
    private String fec_remito;
    @JsonProperty
    private String cod_almacen_origen;
    @JsonProperty
    private String cod_almacen;
    @JsonProperty
    private String field_chr2;
    @JsonProperty
    private String can_remito;
    @JsonProperty
    private String USAP;
    @JsonProperty
    private String fec_vencimiento;
    @JsonProperty
    private String SSAP;
    @JsonProperty
    private String nro_sscc;

    public String getField_chr1() {
        return field_chr1;
    }
    public void setField_chr1(String field_chr1) {
        this.field_chr1 = field_chr1;
    }
    public String getFec_remito() {
        return fec_remito;
    }
    public void setFec_remito(String fec_remito) {
        this.fec_remito = fec_remito;
    }
    public String getCod_almacen_origen() {
        return cod_almacen_origen;
    }
    public void setCod_almacen_origen(String cod_almacen_origen) {
        this.cod_almacen_origen = cod_almacen_origen;
    }
    public String getCod_almacen() {
        return cod_almacen;
    }
    public void setCod_almacen(String cod_almacen) {
        this.cod_almacen = cod_almacen;
    }
    public String getField_chr2() {
        return field_chr2;
    }
    public void setField_chr2(String field_chr2) {
        this.field_chr2 = field_chr2;
    }
    public String getCan_remito() {
        return can_remito;
    }
    public void setCan_remito(String can_remito) {
        this.can_remito = can_remito;
    }
    public String getUSAP() {
        return USAP;
    }
    public void setUSAP(String uSAP) {
        USAP = uSAP;
    }
    public String getFec_vencimiento() {
        return fec_vencimiento;
    }
    public void setFec_vencimiento(String fec_vencimiento) {
        this.fec_vencimiento = fec_vencimiento;
    }
    public String getSSAP() {
        return SSAP;
    }
    public void setSSAP(String sSAP) {
        SSAP = sSAP;
    }
    public String getNro_sscc() {
        return nro_sscc;
    }
    public void setNro_sscc(String nro_sscc) {
        this.nro_sscc = nro_sscc;
    }
    
    
}

