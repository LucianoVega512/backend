
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Proyecto;
import com.proyectointegrador.backend.repositorio.ProyectoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServicio implements IProyectoServicio
{
    @Autowired
    private ProyectoRepositorio proyectoRepositorio;

    @Override
    public List<Proyecto> traerProyectos() 
    {
        List<Proyecto> proyectos = proyectoRepositorio.findAll();
        return proyectos;
    }    
}
