package com.springboot.crud1.services;

import com.springboot.crud1.Repository.Animalrepository;
import com.springboot.crud1.model.Animal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceimpl implements AnimalServices{
    private  final Animalrepository animalrepository;

    public AnimalServiceimpl(Animalrepository animalrepository) {
        this.animalrepository = animalrepository;
    }


    @Override
    public List<Animal> findallAnimal() {
        return animalrepository.findAll();
    }

    @Override
    public Optional<Animal> findById(Long id) {
        return animalrepository.findById(id);
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalrepository.save(animal);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return animalrepository.save(animal);
    }

    @Override
    public void deleteAnimal(Long id) {
        animalrepository.deleteById(id);

    }
}
