package com.learningspring.udemy.petclinic.services;

import com.learningspring.udemy.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet Pet);
    Set<Pet> finaAll();

}
