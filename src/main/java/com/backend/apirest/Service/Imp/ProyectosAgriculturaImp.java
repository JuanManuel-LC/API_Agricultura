package com.backend.apirest.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.Model.ProyectosAgriculturaModel;
import com.backend.apirest.Repository.IProyectosAgriculturaRepository;
import com.backend.apirest.Service.IProyectosAgriculturaService;

@Service
public class ProyectosAgriculturaImp implements IProyectosAgriculturaService{
    @Autowired IProyectosAgriculturaRepository proyectosRepository;

    @Override
    public String CrearProyecto(ProyectosAgriculturaModel proyecto){
        proyectosRepository.save(proyecto);
                return "El proyecto" + proyecto.getId()+ " fue creado con exito";
    }

    @Override
    public List<ProyectosAgriculturaModel> Listar() {
        return proyectosRepository.findAll(); 
    }

    @Override
    public ProyectosAgriculturaModel BuscarProyectoPorId(ObjectId proyectoId) {
        return proyectosRepository.findById(proyectoId).orElse(null);
    }


    @Override
    public ProyectosAgriculturaModel BorrarProyecto(ObjectId proyectoId) {
        Optional<ProyectosAgriculturaModel> proyecto = proyectosRepository.findById(proyectoId);

        if (proyecto.isPresent()) {
            proyectosRepository.deleteById(proyectoId);
        } else {
            return null;
        }
        
        return null;
    }

    
    
}
