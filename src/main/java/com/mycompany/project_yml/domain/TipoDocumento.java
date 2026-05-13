package com.mycompany.project_yml.domain;

import com.mycompany.project_yml.domain.enumeration.Estado;
import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "tipo_documento") // esta anotaacoin indicando que clase va se un documento en mongo
public class TipoDocumento implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;



    @Id // indica que este campo es el identificador unico del documento en mongo
    private String id;

    @Nonnull
    @Indexed(unique = true, name = "idx_unique_sigla") // crea un indice unico en mongo para este campo
    @Field("sigla")
    @Size(max=10)
    private String sigla;

    @Nonnull
    @Field("nombre_documento")
    @Size(max=100)
    @Indexed(unique = true, name = "idx_unique_nombre_documento")
    private String nombreDocumento;

    @Nonnull
    @Field("estado")
    private Estado estado;

    @DBRef
    @Field("clientes")
    private Set<Cliente> clientes =new HashSet<>();

    public TipoDocumento(String id, @Nonnull String sigla, @Nonnull Estado estado, @Nonnull String nombreDocumento) {
        this.id = id;
        this.sigla = sigla;
        this.estado = estado;
        this.nombreDocumento = nombreDocumento;
    }

    public String getId() {
        return id;
    }

    @Nonnull
    public Estado getEstado() {
        return estado;
    }

    @Nonnull
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    @Nonnull
    public String getSigla() {
        return sigla;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSigla(@Nonnull String sigla) {
        this.sigla = sigla;
    }

    public void setNombreDocumento(@Nonnull String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public void setEstado(@Nonnull Estado estado) {
        this.estado = estado;
    }
}