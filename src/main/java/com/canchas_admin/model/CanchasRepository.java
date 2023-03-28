package com.canchas_admin.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface CanchasRepository extends CrudRepository<Canchas, Long>{

    List getAllcanchas();

}