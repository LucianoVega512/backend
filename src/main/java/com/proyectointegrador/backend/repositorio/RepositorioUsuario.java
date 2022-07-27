
package com.proyectointegrador.backend.repositorio;
import com.proyectointegrador.backend.modelo.Usuario;
import java.util.Arrays;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer>
{   
    
}
