package com.learningspring.udemy.petclinic.services;

import com.learningspring.udemy.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> finaAll();

}
