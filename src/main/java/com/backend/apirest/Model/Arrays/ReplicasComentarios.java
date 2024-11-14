package com.backend.apirest.Model.Arrays;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReplicasComentarios {
    private ObjectId usuarioId;
    private String texto;
    private List<String> recursoMultimedia = new ArrayList<>();
    private List<String> documentoElectronico = new ArrayList<>();
}
