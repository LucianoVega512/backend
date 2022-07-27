
package com.proyectointegrador.backend.repositorio;
import com.proyectointegrador.backend.modelo.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTarjeta extends JpaRepository<Tarjeta, Integer>
{   
    
}