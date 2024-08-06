package com.springboot.crud1.controller;


import com.springboot.crud1.model.Animal;
import com.springboot.crud1.services.AnimalServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalServices animalServices;

    public AnimalController(AnimalServices animalServices) {
        this.animalServices = animalServices;
    }

    @GetMapping
    public List<Animal> findallAnimal(){
        return animalServices.findallAnimal();
    }

    @GetMapping("/{id}")
    public Optional<Animal> findAnimalById(@PathVariable("id") Long id){
        return animalServices.findById(id);
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal){
        return animalServices.saveAnimal(animal);
    }

    @PutMapping
    public Animal updateAnimal(@PathVariable("id") Long id,@RequestBody Animal animal){
        return animalServices.updateAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public  void  deleteAnimal(@PathVariable("id") Long id){
        animalServices.deleteAnimal(id);
    }





}
