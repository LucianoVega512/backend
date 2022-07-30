
package com.proyectointegrador.backend.modelo;

public class Administrador 
{
    private String usuario;
    private String clave;
    private Administrador administrador;

    public Administrador(String usuario, String clave, Administrador administrador) {
        this.usuario = usuario;
        this.clave = clave;
        this.administrador = administrador;
    }

    public String getClave() {
        return clave;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public boolean esAdministrador()
    {
        return this.administrador.getUsuario().equals(usuario) && this.administrador.getClave().equals(clave);
    }
}
