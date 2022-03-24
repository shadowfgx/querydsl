package com.example.querydsl.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "blogposts")
@EqualsAndHashCode
public class BlogPost {
    private static final long serialVersionUID = -4277100454311602071L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version = 0L;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "cuerpo")
    private String cuerpo;

    @ManyToOne
    private Usuario2 usuario2;
}
