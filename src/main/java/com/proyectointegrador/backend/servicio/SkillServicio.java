
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Skill;
import com.proyectointegrador.backend.repositorio.SkillRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServicio implements ISkillServicio
{
    @Autowired
    private SkillRepositorio skillRepositorio;

    @Override
    public List<Skill> traerSkills() 
    {
        List<Skill> skills = skillRepositorio.findAll();
        return skills;
    }
}
