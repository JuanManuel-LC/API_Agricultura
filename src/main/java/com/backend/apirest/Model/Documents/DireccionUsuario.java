package com.backend.apirest.Model.Documents;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DireccionUsuario {
    private String ubicacion;
    private String barrio;
    private String codigoPostal;
    private String ciudad;
    private String departamento;

}
