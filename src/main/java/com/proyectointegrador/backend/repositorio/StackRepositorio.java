
package com.proyectointegrador.backend.repositorio;

import com.proyectointegrador.backend.modelo.Stack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StackRepositorio extends JpaRepository<Stack, Integer>
{
    
}
