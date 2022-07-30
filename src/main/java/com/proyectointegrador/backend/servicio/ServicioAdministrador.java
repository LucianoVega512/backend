
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Administrador;
import org.springframework.stereotype.Service;

@Service
public class ServicioAdministrador 
{
    public Administrador obtenerAdministrador(Administrador administrador)
    {
        Administrador _administrador = new Administrador("admin", "admin", administrador);
        return _administrador;
    }
}
