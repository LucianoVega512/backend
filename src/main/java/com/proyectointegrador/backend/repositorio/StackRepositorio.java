
package com.proyectointegrador.backend.repositorio;

import com.proyectointegrador.backend.modelo.Stack;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StackRepositorio extends JpaRepository<Stack, Integer>
{
//    select * from stack where stack.usuario_id = 2
    
//    @Query("SELECT u FROM Stack u WHERE u.usuario_id = ?1")    
//    @Query("select * from stack where stack.usuario_id = ?1")
//    public List<Stack> buscarStacksPorIdUsuario(int id);
//    public List<Stack> findById(int id);
}
