
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Descripcion;
import com.proyectointegrador.backend.repositorio.RepositorioDescripcion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioDescripcion 
{
    @Autowired
    private RepositorioDescripcion repositorioDescripcion; 
    
    public List<Descripcion> obtenerDescripciones()
    {
        return repositorioDescripcion.findAll();
    }
    
    public Descripcion obtenerDescripcion(int id)
    {
        return repositorioDescripcion.findById(id).orElse(null);
    }
    
    public void guardarDescripcion(Descripcion descripcion)
    {
        repositorioDescripcion.save(descripcion);
    }
}
