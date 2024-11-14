package com.backend.apirest.Model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.backend.apirest.Model.Arrays.ColaboradorProyectos;
import com.backend.apirest.Model.Arrays.InfoCreadorProyectos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document ("ProyectosAgricultura")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProyectosAgriculturaModel {
    private ObjectId id;
    private ObjectId usuarioId;
    private String tipoCultivo;
    private String estado;
    private List<String> fotos = new ArrayList<>();
    private List<ColaboradorProyectos> colaborador = new ArrayList<>();
    private List<InfoCreadorProyectos> infoCreador = new ArrayList<>();
}
