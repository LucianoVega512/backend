/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectointegrador.backend.modelo;

public class Usuario
{
    private String nombre;
    private String clave;
    private String token;

    public Usuario()
    {
    }

    public Usuario(String nombre, String clave, String token)
    {
        this.nombre = nombre;
        this.clave = clave;
        this.token = token;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getClave()
    {
        return clave;
    }

    public void setClave(String clave)
    {
        this.clave = clave;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    @Override
    public String toString()
    {
        return "Usuario{" + "nombre=" + nombre + ", clave=" + clave + ", token=" + token + '}';
    }
}
