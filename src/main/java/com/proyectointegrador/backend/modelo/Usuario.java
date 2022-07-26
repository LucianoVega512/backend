
package com.proyectointegrador.backend.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    
    @Column(name = "clave")
    private String clave;
    
    @Column(name = "token")
    private String token;
    
    @Column(name = "nombre_acerca_de")
    private String nombreAcercaDe;
}
