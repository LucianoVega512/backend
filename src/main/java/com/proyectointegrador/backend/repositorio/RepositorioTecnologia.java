
package com.proyectointegrador.backend.repositorio;

import com.proyectointegrador.backend.modelo.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTecnologia extends JpaRepository<Tecnologia, Integer>
{   
    
}
