
package com.proyectointegrador.backend.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
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
