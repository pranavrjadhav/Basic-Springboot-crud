package com.springboot.crud1.services;

import com.springboot.crud1.Repository.Animalrepository;
import com.springboot.crud1.model.Animal;
//import com.springboot.crud1.services.impl.AnimalServices;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceimpl {
    private  final Animalrepository animalrepository;

    public AnimalServiceimpl(Animalrepository animalrepository) {
        this.animalrepository = animalrepository;
    }

    public List<Animal> findallAnimal() {
        List<Animal> animals = animalrepository.findAll();
        System.out.println("hi there pranav"+animals);
        return animals;
    }


    public Optional<Animal> findById(Long id) {
        Optional<Animal> animal1=animalrepository.findById(id);
        System.out.println("hi there pranav biid "+ animal1);
        return animalrepository.findById(id);
    }

    public Animal saveAnimal(Animal animal) {
        Optional<Animal> opt = Optional.of(animalrepository.save(animal));
        System.out.println(opt);
        return animalrepository.save(animal);
    }

    public Animal updateAnimal(Animal animal) {
        return animalrepository.save(animal);

    }

    public void deleteAnimal(Long id) {
        animalrepository.deleteById(id);

    }
}
