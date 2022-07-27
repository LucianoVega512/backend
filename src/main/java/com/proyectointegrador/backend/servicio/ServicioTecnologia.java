
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Tecnologia;
import com.proyectointegrador.backend.repositorio.RepositorioTecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTecnologia 
{
    @Autowired
    private RepositorioTecnologia repositorioTecnologia; 
    
    public List<Tecnologia> obtenerTecnologias()
    {
        return repositorioTecnologia.findAll();
    }
    
    public Tecnologia obtenerTecnologia(int id)
    {
        return repositorioTecnologia.findById(id).orElse(null);
    }
    
    public void guardarTecnologia(Tecnologia tecnologia)
    {
        repositorioTecnologia.save(tecnologia);
    }
}
