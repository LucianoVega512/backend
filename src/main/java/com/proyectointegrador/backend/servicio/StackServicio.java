
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Stack;
import com.proyectointegrador.backend.repositorio.StackRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StackServicio implements IStackServicio
{
    @Autowired
    private StackRepositorio stackRepositorio;

    @Override
    public Stack obtenerStack(int id) {
        return stackRepositorio.findById(id).orElse(null);
    }
    
    
    
    
}
