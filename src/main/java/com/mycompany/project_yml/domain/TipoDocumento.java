package com.mycompany.project_yml.domain;

public class TipoDocumento {
    private String id;
    private String  siglas;
    private String nombreDocumento;
    private String estado;
    public TipoDocumento(String siglas,String nombreDocumento,String estado){
        this.siglas= siglas;
        this.nombreDocumento = nombreDocumento;
        this.estado= estado;
    }

}
