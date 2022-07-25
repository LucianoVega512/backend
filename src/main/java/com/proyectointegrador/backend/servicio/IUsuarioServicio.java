
package com.proyectointegrador.backend.servicio;

import com.proyectointegrador.backend.modelo.Usuario;

public interface IUsuarioServicio 
{
    public Usuario obtenerUsuario(String usuario);
    public void guardarUsuario(Usuario usuario);
}
