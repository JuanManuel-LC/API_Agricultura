package com.backend.apirest.Model.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

import com.backend.apirest.Model.ENUM.TipoRecursoMultimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor


public class RecursoMultimedia {
    private TipoRecursoMultimedia tipo;
    private String contenidoMultimedia;
}
