package com.learningspring.udemy.petclinic.services;

import com.learningspring.udemy.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
