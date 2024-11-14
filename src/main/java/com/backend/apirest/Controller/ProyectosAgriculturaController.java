package com.backend.apirest.Controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.Model.ProyectosAgriculturaModel;
import com.backend.apirest.Service.IProyectosAgriculturaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("UAO/apirest/Proyectos-Agricultura")
public class ProyectosAgriculturaController {
    @Autowired IProyectosAgriculturaService proyectoService;

    @PostMapping("/insertar")
    public ResponseEntity<String> crearProyecto(@RequestBody ProyectosAgriculturaModel proyectos) {
        return new ResponseEntity<>(proyectoService.CrearProyecto(proyectos), HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ProyectosAgriculturaModel>> listarProyectos(){
        return new ResponseEntity<List<ProyectosAgriculturaModel>>(proyectoService.Listar(), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProyectosAgriculturaModel> borrarProyecto(@PathVariable ObjectId id) {
        ProyectosAgriculturaModel deletedProyecto = proyectoService.BorrarProyecto(id);
        
        if (deletedProyecto != null) {
            return ResponseEntity.ok(deletedProyecto);  // Devuelve el proyecto eliminado
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Retorna 404 si el proyecto no existe
        }
    }
    
    
    
}
