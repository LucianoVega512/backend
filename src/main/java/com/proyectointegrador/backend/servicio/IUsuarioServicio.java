
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Usuario;

public interface IUsuarioServicio 
{
    public Usuario obtenerUsuario(int id); 
    public void guardarUsuario(Usuario usuario); 
}
