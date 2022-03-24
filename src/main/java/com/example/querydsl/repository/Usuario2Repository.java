package com.example.querydsl.repository;

import com.example.querydsl.model.Usuario2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface Usuario2Repository extends JpaRepository<Usuario2, Long>,
        QuerydslPredicateExecutor<Usuario2>, Usuario2RepositoryCustom{
}
