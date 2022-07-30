
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Chip;
import com.proyectointegrador.backend.modelo.Descripcion;
import com.proyectointegrador.backend.modelo.Tarjeta;
import com.proyectointegrador.backend.modelo.Tecnologia;
import com.proyectointegrador.backend.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPortafolio 
{    
    @Autowired
    private ServicioTarjeta servicioTarjeta;
    
    @Autowired
    private ServicioTecnologia servicioTecnologia;
    
    @Autowired
    private ServicioDescripcion servicioDescripcion;
    
    @Autowired
    private ServicioChip servicioChip;
    
    private Usuario usuario;
    private List<Tecnologia> tecnologias;
    private List<Tarjeta> tarjetas;
    private List<Descripcion> descripciones;
    private List<Chip> chips;

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
        this.tecnologias = servicioTecnologia.obtenerTecnologias();
        this.tarjetas = servicioTarjeta.obtenerTarjetas();
        this.descripciones = servicioDescripcion.obtenerDescripciones();
        this.chips = servicioChip.obtenerChips();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public List<Descripcion> getDescripciones() {
        return descripciones;
    }

    public List<Chip> getChips() {
        return chips;
    }
}
