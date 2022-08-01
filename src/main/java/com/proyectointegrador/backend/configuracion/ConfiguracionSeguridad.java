package com.proyectointegrador.backend.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .addFilterAfter(new FiltroSeguridad(), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/api/usuario").permitAll()
                .antMatchers(HttpMethod.GET, "/api/usuario").permitAll()
                .anyRequest().authenticated();
    }
}
