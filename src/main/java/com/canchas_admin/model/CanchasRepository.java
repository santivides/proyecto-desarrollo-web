package com.canchas_admin.model;

import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;

public interface CanchasRepository extends CrudRepository<Canchas, Long>{

    List getAllcanchas();

}