package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Usuario;
import com.proyectointegrador.backend.servicio.UsuarioServicio;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

//    @PostMapping("/api/usuario")
//    public Usuario obtenerUsuario(@RequestBody Usuario usuario, HttpServletResponse request) throws IOException 
//    {
//        Usuario usr = usuarioServicio.obtenerUsuario(usuario.getNombre());
//        
//        if (!usr.getNombre().equals("") && usr.getClave().equals(usuario.getClave())) 
//        {
//            usr.setToken(generarToken(usuario.getNombre()));
//        } 
//        else 
//        {
//            request.sendError(HttpServletResponse.SC_FORBIDDEN);
//        }
//
//        return usr;
//    }
//
//    @GetMapping("/api/valido")
//    public void tokenValido(HttpServletResponse respuesta) 
//    {
//        respuesta.setStatus(HttpServletResponse.SC_ACCEPTED);
//    }

    private String generarToken(String usr) {
        String clave = "Luc1@N0";
        List<GrantedAuthority> autoridades = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts.builder().setId("Prueba")
                .setSubject(usr)
                .claim("authorities", autoridades.stream().map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512, clave.getBytes()).compact();

        return "Bearer " + token;
    }
}
