package com.backend.apirest.Model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


import com.backend.apirest.Model.Arrays.ProyectosUsuarios;
import com.backend.apirest.Model.Arrays.SeguidoresUsuarios;
import com.backend.apirest.Model.Documents.DireccionUsuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document ("Usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuariosModel {
    private ObjectId id;
    private String nombre;
    private String foto;
    private String reseñaPerfil;
    private String username;
    private String password;
    private String email;
    private DireccionUsuario direccion;
    private List<SeguidoresUsuarios> seguidores = new ArrayList<>();
    private List<ProyectosUsuarios> proyectos = new ArrayList<>();
}
