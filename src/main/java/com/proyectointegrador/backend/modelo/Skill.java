
package com.proyectointegrador.backend.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Skill
{
    private String tecnologia;
    private Integer nivel;

    public Skill()
    {
    }
    
    public Skill(String tecnologia, Integer nivel)
    {
        this.tecnologia = tecnologia;
        this.nivel = nivel;
    }
}
