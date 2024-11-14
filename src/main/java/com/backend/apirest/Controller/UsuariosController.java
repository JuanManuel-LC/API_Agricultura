package com.backend.apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.Model.UsuariosModel;
import com.backend.apirest.Service.IUsuariosService;

@RestController
@RequestMapping("UAO/apirest/Usuarios")
public class UsuariosController {
    @Autowired IUsuariosService usuariosService;
    @PostMapping ("/insertar")
    public ResponseEntity<String> crearUsuario (@RequestBody UsuariosModel usuario){
        return new ResponseEntity<>(usuariosService.GuardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<UsuariosModel>> ListarUsuarios() {
        return new ResponseEntity<List<UsuariosModel>>(usuariosService.ListarUsuarios(), HttpStatus.OK);
    }
    
}
