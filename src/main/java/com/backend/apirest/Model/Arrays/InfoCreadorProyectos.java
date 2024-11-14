package com.backend.apirest.Model.Arrays;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InfoCreadorProyectos {
    private ObjectId id;
    private String nombre;
}
