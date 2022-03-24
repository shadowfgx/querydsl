package com.example.querydsl.controller;

import com.example.querydsl.model.Usuario2;
import com.example.querydsl.service.Usuario2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Usuario2Controller {

    @Autowired
    private Usuario2Service usuario2Service;

    @GetMapping(value = "/usuario2/{id}")
    public Usuario2 getPerson(@PathVariable("id") Long id) {
        Optional<Usuario2> usuario = usuario2Service.findById(id);
        System.out.println("git1");
        return usuario.orElse(null);
    }

    @GetMapping("/usuario2/updateName/{id}")
    public Usuario2 updateName(@PathVariable("id") Long id){
        Long result =usuario2Service.UpdateUsuario2(id);
        Optional<Usuario2> usuario = usuario2Service.findById(id);
        System.out.println(result);
        return usuario.orElse(null);
    }
}
