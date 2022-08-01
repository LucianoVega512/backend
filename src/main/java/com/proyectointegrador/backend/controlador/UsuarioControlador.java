package com.proyectointegrador.backend.controlador;

import com.proyectointegrador.backend.modelo.Administrador;
import com.proyectointegrador.backend.servicio.ServicioPortafolio;
import com.proyectointegrador.backend.modelo.Usuario;
import com.proyectointegrador.backend.servicio.ServicioAdministrador;
import com.proyectointegrador.backend.servicio.ServicioUsuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @Autowired
    private ServicioPortafolio portfolio;

    @Autowired
    private ServicioAdministrador servicioAdministrador;

    @PostMapping("/api/usuario/administrador")
    public boolean esAdministrador(@RequestBody Administrador administrador) {
        return servicioAdministrador.obtenerAdministrador(administrador).esAdministrador();
    }

    @CrossOrigin(origins = "https://still-spire-76335.herokuapp.com")
    @PostMapping("/api/usuario")
    public ResponseEntity<ServicioPortafolio> obtenerUsuario(@RequestBody Usuario usuario) {
        String clave = usuario.getClave();
        String nombre = usuario.getNombreUsuario();

        Usuario _usuario = servicioUsuario.obtenerUsuario(1);

        if (_usuario.getClave().equals(clave) && _usuario.getNombreUsuario().equals(nombre)) {
            _usuario.setToken(generarToken(nombre));

            portfolio.setUsuario(_usuario);

//            return new ResponseEntity<>(portfolio, HttpStatus.OK);
            return new ResponseEntity<>(null, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
    }

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
