package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.AcercaDe;
import com.proyectointegrador.backend.modelo.Portfolio;
import com.proyectointegrador.backend.modelo.Stack;
import com.proyectointegrador.backend.modelo.Usuario;
import com.proyectointegrador.backend.servicio.AcercaDeServicio;
import com.proyectointegrador.backend.servicio.ProyectoServicio;
import com.proyectointegrador.backend.servicio.SkillServicio;
import com.proyectointegrador.backend.servicio.StackServicio;
import com.proyectointegrador.backend.servicio.UsuarioServicio;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PortfolioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @Autowired
    private StackServicio stackServicio;

    @Autowired
    private AcercaDeServicio acercaDeServicio;

    @Autowired
    private SkillServicio skillServicio;

    @Autowired
    private ProyectoServicio proyectoServicio;

    @GetMapping("/api/stack/{id}")
    public Stack obtenerStack(@PathVariable Integer id) {
        return stackServicio.obtenerStack(id);
    }
    
    @GetMapping("/api/acerca-de")
    public AcercaDe obtenerAcercaDe() {
        return acercaDeServicio.obtenerAcercaDe(1);
    }
}
