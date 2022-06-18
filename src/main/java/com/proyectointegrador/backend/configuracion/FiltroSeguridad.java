
package com.proyectointegrador.backend.configuracion;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

public class FiltroSeguridad extends OncePerRequestFilter
{

    private final String CABECERA = "Authorization";
    private final String PREFIJO = "Bearer ";
    private final String CLAVE = "Luc1@N0";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain cadena) 
            throws ServletException, IOException
    {
        try
        {
            if (chekearToken(request, response))
            {
                Claims claims = validarToken(request);
                if (claims.get("authorities") != null)
                {
                    setearAutenticacion(claims);
                } else
                {
                    SecurityContextHolder.clearContext();
                }
            } else
            {
                SecurityContextHolder.clearContext();
            }
            cadena.doFilter(request, response);
        } 
        catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException e)
        {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
        }
    }

    private Claims validarToken(HttpServletRequest request)
    {
        String jwtToken = request.getHeader(CABECERA).replace(PREFIJO, "");
        return Jwts.parser().setSigningKey(CLAVE.getBytes()).parseClaimsJws(jwtToken).getBody();
    }

    private void setearAutenticacion(Claims claims)
    {
        List<String> authorities = (List<String>) claims.get("authorities");

        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(claims.getSubject(), null,
                authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));

        SecurityContextHolder.getContext().setAuthentication(auth);
    }

    private boolean chekearToken(HttpServletRequest request, HttpServletResponse response)
    {
        String cabeceraAutenticacion = request.getHeader(CABECERA);
        return !(cabeceraAutenticacion == null || !cabeceraAutenticacion.startsWith(PREFIJO));
    }

}
