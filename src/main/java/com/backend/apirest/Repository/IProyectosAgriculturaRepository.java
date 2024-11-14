package com.backend.apirest.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.apirest.Model.ProyectosAgriculturaModel;

public interface IProyectosAgriculturaRepository extends MongoRepository<ProyectosAgriculturaModel, ObjectId>{
    
}
