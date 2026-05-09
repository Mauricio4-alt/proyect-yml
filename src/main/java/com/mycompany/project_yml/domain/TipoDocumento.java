package com.mycompany.project_yml.domain;

import jakarta.annotation.Nonnull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tipo_documentos")
public class TipoDocumento {

    @Id
    private String id;

    @Nonnull
    @Field("asdaf")
    private String siglas;

    @Field("nombre_documento")
    private String nombreDocumento;

    private String estado;

    public TipoDocumento(String siglas,String nombreDocumento,String estado){
        this.siglas= siglas;
        this.nombreDocumento = nombreDocumento;
        this.estado= estado;
    }

}
