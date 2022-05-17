package com.PI.ProyectoIntegrador.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Categoria {
    @Id
    @SequenceGenerator(name = "categoriaSequence",sequenceName = "categoriaSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoriaSequence")
    private Long id;
    private String title;
    private String description;
    private String urlImage;

    //Constructor de Categoria default
    public Categoria() {}
}
