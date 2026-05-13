package com.mycompany.project_yml.domain;

import com.mycompany.project_yml.domain.enumeration.Estado;
import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;

public class Cuenta implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;

    @Id
    private String id;

    @Field("nickname")
    @Nonnull
    @Size(max=50)
    private String nickname;


    private Estado estado;

}
