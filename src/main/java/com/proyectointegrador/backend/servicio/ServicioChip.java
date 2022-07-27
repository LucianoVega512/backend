
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.repositorio.RepositorioChip;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioChip 
{
    @Autowired
    private RepositorioChip repositorioChip; 
    
    @PersistenceContext
    private EntityManager entidad;
    
    public List<Chip> obtenerChips()
    {
        return repositorioChip.findAll();
    }
    
    public void guardarChip(Chip chip)
    {
        int id = entidad.createQuery("SELECT c FROM Chip c ORDER BY c.id DESC", Chip.class)
                .setMaxResults(1).getSingleResult().getId();
        chip.setId(++id);
        repositorioChip.save(chip);
    }
    
    public void eliminarChip(Chip chip){
        repositorioChip.delete(chip);
    }
}
