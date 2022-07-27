package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.servicio.ServicioChip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioControlador {

    @Autowired
    private ServicioChip servicioChip;
       
    
    @DeleteMapping("api/eliminar/chip")
    public ResponseEntity<String> eliminarChip(@RequestBody Chip chip) 
    {
        servicioChip.eliminarChip(chip);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
    @PostMapping("api/crear/chip")
    public ResponseEntity<String> crearChip(@RequestBody Chip chip) 
    {
        servicioChip.guardarChip(chip);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
}
