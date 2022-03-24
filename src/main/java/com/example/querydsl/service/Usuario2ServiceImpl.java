package com.example.querydsl.service;

import com.example.querydsl.model.Usuario2;
import com.example.querydsl.repository.Usuario2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Usuario2ServiceImpl implements Usuario2Service{

    @Autowired
    private Usuario2Repository usuario2Repository;

    @Override
    public Optional<Usuario2> findById(Long id) {
        return usuario2Repository.findById(id);
    }

    @Override
    public Long UpdateUsuario2(Long id) {
        return usuario2Repository.updateUsuario2(id);
    }
}
