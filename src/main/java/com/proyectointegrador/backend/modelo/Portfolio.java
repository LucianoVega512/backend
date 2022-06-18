package com.proyectointegrador.backend.modelo;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Portfolio
{
    private List<String> acercaDe;
    private List<String> stack;
    private List<Skill> skills;
    private List<Proyecto> proyectos;   
}

