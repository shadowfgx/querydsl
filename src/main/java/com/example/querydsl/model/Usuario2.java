package com.example.querydsl.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "usuario2")
@EqualsAndHashCode
public class Usuario2 {
    private static final long serialVersionUID = -4277100454311602070L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "deshabilitado")
    private Boolean deshabilitado;

    @Column(name = "blog_post")
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "usuario2")
    private Set<BlogPost> blogPosts = new HashSet<>(0);
}
