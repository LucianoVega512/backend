
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Stack;
import com.proyectointegrador.backend.repositorio.StackRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StackServicio implements IStackServicio
{
    @Autowired
    private StackRepositorio stackRepositorio;

    @Override
    public List<Stack> traerStacks() 
    {
        List<Stack> stacks = stackRepositorio.findAll();
        return stacks;
    }
}
