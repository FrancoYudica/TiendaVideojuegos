package com.videojuego.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table( name = "estudios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private boolean activo = true;
    @OneToMany(mappedBy = "estudio")
    private List<Videojuego> videojuegos;


}

