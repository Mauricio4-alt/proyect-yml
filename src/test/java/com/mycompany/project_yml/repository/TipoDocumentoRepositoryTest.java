package com.mycompany.project_yml.repository;

import com.mycompany.project_yml.domain.TipoDocumento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;

@DataMongoTest
class TipoDocumentoRepositoryTest {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Test
    void insert() {
        TipoDocumento tipoDocumento = new TipoDocumento("CC", "Cedula ciudadania", "activo");
        tipoDocumentoRepository.insert(tipoDocumento);
    }

}
