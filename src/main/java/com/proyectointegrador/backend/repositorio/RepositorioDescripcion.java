
package com.proyectointegrador.backend.repositorio;

import com.proyectointegrador.backend.modelo.Descripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDescripcion extends JpaRepository<Descripcion, Integer>
{   
    
}
