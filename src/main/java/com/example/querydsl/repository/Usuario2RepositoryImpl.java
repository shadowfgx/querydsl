package com.example.querydsl.repository;

import com.example.querydsl.model.QUsuario2;
import com.example.querydsl.model.Usuario2;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAUpdateClause;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class Usuario2RepositoryImpl extends QuerydslRepositorySupport implements Usuario2RepositoryCustom {
    public Usuario2RepositoryImpl() {
        super(Usuario2.class);
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Long updateUsuario2(Long id) {
        JPAUpdateClause update = new JPAQueryFactory(entityManager).update(QUsuario2.usuario2);

        Long idResult = update.where(QUsuario2.usuario2.id.eq(id)).
                set(QUsuario2.usuario2.login, "updatenombre").execute();

        return idResult;
    }
}
