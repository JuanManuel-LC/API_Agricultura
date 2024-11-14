package com.backend.apirest.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.Model.UsuariosModel;
import com.backend.apirest.Repository.IUsuariosRepository;
import com.backend.apirest.Service.IUsuariosService;


@Service
public class UsuarioServiceImp implements IUsuariosService{

    @Autowired IUsuariosRepository usuariosRepository;
    @Override
    public String GuardarUsuario(UsuariosModel usuario) {
        usuariosRepository.save(usuario);
        return "El usuario "+usuario.getNombre()+ ", fue creado con exito";
    }
    @Override
    public List<UsuariosModel> ListarUsuarios() {
        return usuariosRepository.findAll();
    }
    
}
