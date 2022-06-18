/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Portfolio;
import com.proyectointegrador.backend.modelo.Proyecto;
import com.proyectointegrador.backend.modelo.Skill;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioControlador
{
    @GetMapping("/api/portfolio")
    public Portfolio obtenerPortfolio()
    {
        Portfolio portfolio = new Portfolio();
        portfolio.setAcercaDe(Arrays.asList("Experiencia con Java SE", "Otra experiencia en esta etiqueta"));
        portfolio.setStack(Arrays.asList("Fornt-end con Angular 13", "Estilo con PrimeNg", "Back-end con Spring-boot",
                "Autenticacion JWT", "Base de datos relacional con MySql"));
        portfolio.setProyectos(Arrays.asList(new Proyecto("Adquisicion de datos variables de proceso", "Petroleo.png"), new Proyecto("Analisis de datos", "Analisis.png"), new Proyecto("Internet of things", "Iot.png")));
        portfolio.setSkills(Arrays.asList(new Skill("Java SE", 90), new Skill("JSF", 55),new Skill("Angular", 75),new Skill("Spring-boot", 80),new Skill("MySql", 80), new Skill("VertX", 85)));
        
        return portfolio;
    }
}
