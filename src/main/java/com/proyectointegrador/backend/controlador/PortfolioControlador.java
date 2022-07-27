package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.modelo.Descripcion;
import com.proyectointegrador.backend.modelo.Tarjeta;
import com.proyectointegrador.backend.modelo.Tecnologia;
import com.proyectointegrador.backend.servicio.ServicioChip;
import com.proyectointegrador.backend.servicio.ServicioDescripcion;
import com.proyectointegrador.backend.servicio.ServicioTarjeta;
import com.proyectointegrador.backend.servicio.ServicioTecnologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioControlador {

    @Autowired
    private ServicioChip servicioChip;
    
    @Autowired
    private ServicioTecnologia servicioTecnologia;
    
    @Autowired
    private ServicioTarjeta servicioTarjeta;
    
    @Autowired
    private ServicioDescripcion servicioDescripcion;
    
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
    
    @PutMapping("api/modificar/tecnologia")
    public ResponseEntity<String> modificarTecnologia(@RequestBody Tecnologia tecnologia) 
    {
        servicioTecnologia.guardarTecnologia(tecnologia);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
    @PutMapping("api/modificar/tarjeta")
    public ResponseEntity<String> modificarTarjeta(@RequestBody Tarjeta tarjeta) 
    {
        servicioTarjeta.guardarTarjeta(tarjeta);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
    @PutMapping("api/modificar/descripcion")
    public ResponseEntity<String> modificarDescripcion(@RequestBody Descripcion descripcion) 
    {
        servicioDescripcion.guardarDescripcion(descripcion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
}
