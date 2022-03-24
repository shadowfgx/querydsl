package com.example.querydsl.service;

import com.example.querydsl.model.Usuario2;

import java.util.Optional;

public interface Usuario2Service {

    Optional<Usuario2> findById(Long id);

    Long UpdateUsuario2(Long id);
}
