package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.modelo.Descripcion;
import com.proyectointegrador.backend.modelo.Tarjeta;
import com.proyectointegrador.backend.modelo.Tecnologia;
import com.proyectointegrador.backend.modelo.Usuario;
import com.proyectointegrador.backend.servicio.ServicioChip;
import com.proyectointegrador.backend.servicio.ServicioDescripcion;
import com.proyectointegrador.backend.servicio.ServicioTarjeta;
import com.proyectointegrador.backend.servicio.ServicioTecnologia;
import com.proyectointegrador.backend.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.POST})
public class PortfolioControlador {

    @Autowired
    private ServicioChip servicioChip;

    @Autowired
    private ServicioTecnologia servicioTecnologia;

    @Autowired
    private ServicioTarjeta servicioTarjeta;

    @Autowired
    private ServicioDescripcion servicioDescripcion;

    @Autowired
    private ServicioUsuario servicioUsuario;

    @DeleteMapping("api/eliminar/chip")
    public void eliminarChip(@RequestBody Chip chip) {
        servicioChip.eliminarChip(chip);
    }

    @PostMapping("api/crear/chip")
    public void crearChip(@RequestBody Chip chip) {
        servicioChip.guardarChip(chip);
    }

    @PutMapping("api/modificar/tecnologia")
    public void modificarTecnologia(@RequestBody Tecnologia tecnologia) {
        servicioTecnologia.guardarTecnologia(tecnologia);
    }

    @PutMapping("api/modificar/tarjeta")
    public void modificarTarjeta(@RequestBody Tarjeta tarjeta) {
        servicioTarjeta.guardarTarjeta(tarjeta);
    }

    @PutMapping("api/modificar/descripcion")
    public void modificarDescripcion(@RequestBody Descripcion descripcion) {
        servicioDescripcion.guardarDescripcion(descripcion);
    }

    @PutMapping("api/modificar/acerca_de")
    public void modificarAcercaDe(@RequestBody Usuario usuario) {
        int id = usuario.getId();
        String nombre = usuario.getNombreAcercaDe();

        Usuario _usuario = servicioUsuario.obtenerUsuario(id);
        _usuario.setNombreAcercaDe(nombre);

        servicioUsuario.guardarUsuario(_usuario);
    }
}
