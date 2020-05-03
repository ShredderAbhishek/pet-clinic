package com.learningspring.udemy.petclinic.bootstrap;

import com.learningspring.udemy.petclinic.model.Owner;
import com.learningspring.udemy.petclinic.model.Vet;
import com.learningspring.udemy.petclinic.services.OwnerService;
import com.learningspring.udemy.petclinic.services.VetService;
import com.learningspring.udemy.petclinic.services.map.OwnerServiceMap;
import com.learningspring.udemy.petclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    final private OwnerService ownerService;
    final private VetService vetService;

    @Autowired //optional annotation for Constructor based DI
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Pets....");
    }
}
