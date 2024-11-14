package com.backend.apirest.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.backend.apirest.Model.Arrays.RecursoMultimedia;
import com.backend.apirest.Model.Arrays.ReplicasComentarios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Comentarios")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ComentariosModel {
    private ObjectId id;
    private ObjectId usuarioId;
    private ObjectId proyectoId;
    private String texto;
    private Date fecha;
    private List<RecursoMultimedia> recursoMultimedia = new ArrayList<>();
    private List<ReplicasComentarios> replicas = new ArrayList<>();
    
}
