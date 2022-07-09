package com.maven.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maven.demo.domain.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String>{
}