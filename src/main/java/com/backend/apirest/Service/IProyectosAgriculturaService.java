package com.backend.apirest.Service;

import java.util.List;

import org.bson.types.ObjectId;

import com.backend.apirest.Model.ProyectosAgriculturaModel;

public interface IProyectosAgriculturaService {
    public String CrearProyecto (ProyectosAgriculturaModel proyecto);
    public List<ProyectosAgriculturaModel> Listar();
    public ProyectosAgriculturaModel BorrarProyecto(ObjectId proyectoId);
    public ProyectosAgriculturaModel BuscarProyectoPorId (ObjectId proyectoId);
}
