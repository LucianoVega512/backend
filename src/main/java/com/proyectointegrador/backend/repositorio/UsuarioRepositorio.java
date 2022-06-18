
package com.proyectointegrador.backend.repositorio;
import com.proyectointegrador.backend.modelo.Usuario;
import java.util.Arrays;
import java.util.List;

public class UsuarioRepositorio
{
    private static final List<Usuario> USUARIOS = Arrays.asList(new Usuario("usuario", "1234", ""),
            new Usuario("usuario2", "4321", ""));
    
    public static Usuario obtenerUsuarioPorNombre(String nombre)
    {
        try
        {
            return USUARIOS.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().get();
        } 
        catch (Exception e)
        {
            return new Usuario("", "", "");
        }
    }
}
