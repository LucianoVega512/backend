package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Usuario;
import com.proyectointegrador.backend.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements IUsuarioServicio {

    @Autowired
    private UsuarioRepositorio usarioRepositorio;

    @Override
    public Usuario obtenerUsuario(String usuario) {
        return usarioRepositorio.findAll().stream().filter((p) -> p.getNombre().equals(usuario)).findAny().get();
    }

}
