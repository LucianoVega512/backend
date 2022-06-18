
package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Portfolio;
import com.proyectointegrador.backend.modelo.Proyecto;
import com.proyectointegrador.backend.modelo.Skill;
import com.proyectointegrador.backend.modelo.Stack;
import com.proyectointegrador.backend.servicio.AcercaDeServicio;
import com.proyectointegrador.backend.servicio.ProyectoServicio;
import com.proyectointegrador.backend.servicio.SkillServicio;
import com.proyectointegrador.backend.servicio.StackServicio;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioControlador
{
    @Autowired
    private StackServicio stackServicio;
    
    @Autowired
    private AcercaDeServicio acercaDeServicio;
    
    @Autowired
    private SkillServicio skillServicio;
     
    @Autowired
    private ProyectoServicio proyectoServicio;
    
    @GetMapping("/api/portfolio")
    public Portfolio obtenerPortfolio()
    {
        Portfolio portfolio = new Portfolio();
        portfolio.setAcercaDe(obtenerAcercaDe());
        portfolio.setStack(descripcionesStack());
        portfolio.setProyectos(proyectoServicio.traerProyectos());
        portfolio.setSkills(skillServicio.traerSkills());
        
        return portfolio;
    }
    
    private List<String> descripcionesStack()
    {
        return stackServicio.traerStacks().stream().map(a->a.getDescripcion()).collect(Collectors.toList());
    }

    private List<String> obtenerAcercaDe()
    {
        return acercaDeServicio.traerAcercaDe().stream().map(m->m.getDescripcion()).collect(Collectors.toList());
    }
}
