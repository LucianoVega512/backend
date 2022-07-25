
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.AcercaDe;
import com.proyectointegrador.backend.repositorio.AcercaDeRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeServicio implements IAcercaDeServicio
{
    @Autowired
    private AcercaDeRepositorio acercaDeRepositorio;
    
    @Override
    public AcercaDe obtenerAcercaDe(int id) {
        return acercaDeRepositorio.findById(id).orElse(null);
    }
}
