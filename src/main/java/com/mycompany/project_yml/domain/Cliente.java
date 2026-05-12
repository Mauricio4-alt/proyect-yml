package com.mycompany.project_yml.domain;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;

@Document(collection = "clientes")
public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Nonnull
    @Size(max = 50)
    @Field("numero_documento")
    private String numeroDocumento;

    @Nonnull
    @Size(max = 50)
    @Field("primer_nombre")
    private String primerNombre;

    @Nonnull
    @Size(max = 50)
    @Field("segundo_nombre")
    private String segundoNombre;

    @Nonnull
    @Size(max = 50)
    @Field("primer_apellido")
    private String primerApellido;

    @Nonnull
    @Size(max = 50)
    @Field("segundo_apellido")
    private String segundoApelligo;

    public Cliente(String id, @Nonnull String numeroDocumento, @Nonnull String primerNombre, String segundoNombre, String primerApellido, String segundoApelligo) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApelligo = segundoApelligo;
    }
}