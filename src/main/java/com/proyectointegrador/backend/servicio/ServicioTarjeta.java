
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Tarjeta;
import com.proyectointegrador.backend.repositorio.RepositorioTarjeta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTarjeta 
{
    @Autowired
    private RepositorioTarjeta repositorioTarjeta; 
    
    public List<Tarjeta> obtenerTarjetas()
    {
        return repositorioTarjeta.findAll();
    }
    
    public Tarjeta obtenerTarjeta(int id)
    {
        return repositorioTarjeta.findById(id).orElse(null);
    }
    
    public void guardarTarjeta(Tarjeta tarjeta)
    {
        repositorioTarjeta.save(tarjeta);
    }
}
