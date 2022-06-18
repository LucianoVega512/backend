
package com.proyectointegrador.backend.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Proyecto
{
    private String descripcion;
    private String urlImagen;

    public Proyecto()
    {
    }
    
    public Proyecto(String descripcion, String urlImagen)
    {
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
    }
}
