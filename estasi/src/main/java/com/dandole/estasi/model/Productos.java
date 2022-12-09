package com.dandole.estasi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="productos")
@Data

public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String descripcion;
    private double precio;
}


