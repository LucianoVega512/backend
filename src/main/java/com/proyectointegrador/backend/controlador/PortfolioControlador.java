package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.servicio.ServicioTecnologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioControlador {

    @Autowired
    private ServicioTecnologia servicioTecnologia;
    
    
}
