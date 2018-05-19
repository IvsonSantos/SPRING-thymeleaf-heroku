package com.ivson.heroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.heroku.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {

}
