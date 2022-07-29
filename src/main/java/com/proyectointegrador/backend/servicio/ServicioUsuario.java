package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectointegrador.backend.repositorio.RepositorioUsuario;

@Service
public class ServicioUsuario implements IUsuarioServicio {

    @Autowired
    private RepositorioUsuario usuarioRepositorio;

    @Override
    public Usuario obtenerUsuario(int id) 
    {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public void guardarUsuario(Usuario usuario) 
    {
        usuarioRepositorio.save(usuario);
    }
    
    
}
