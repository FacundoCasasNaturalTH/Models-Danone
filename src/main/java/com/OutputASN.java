package com;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OutputASN {
    private String field_chr1;
    private String fec_remito;
    private String cod_almacen_origen;
    private String cod_almacen;
    private List<LineDTO> lineDTO;
    
}

@Getter
@Setter
@NoArgsConstructor
class LineDTO{
    private String field_chr2;
    private String field_chr1;
    private String can_remito;
    private String USAP;
    private List<DetailDTO> detail;
}

@Getter
@Setter
@NoArgsConstructor
class DetailDTO{
    private String fec_vencimiento;
    private String SSAP;
    private String nro_sscc;
}
