
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.repositorio.RepositorioChip;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioChip 
{
    @Autowired
    private RepositorioChip repositorioChip; 
    
    public List<Chip> obtenerChips()
    {
        return repositorioChip.findAll();
    }
    
    public Chip obtenerChip(int id)
    {
        return repositorioChip.findById(id).orElse(null);
    }
    
    public void guardarChip(Chip chip)
    {
        repositorioChip.save(chip);
    }
}
