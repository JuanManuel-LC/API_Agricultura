package com.backend.apirest.Service;

import java.util.List;

import com.backend.apirest.Model.UsuariosModel;

public interface IUsuariosService {
    public String GuardarUsuario(UsuariosModel usuario);

    public List<UsuariosModel> ListarUsuarios();
}
    
