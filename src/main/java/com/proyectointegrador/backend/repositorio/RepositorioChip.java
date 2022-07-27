
package com.proyectointegrador.backend.repositorio;

import com.proyectointegrador.backend.modelo.Chip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioChip extends JpaRepository<Chip, Integer>
{   
    
}
