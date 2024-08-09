package com.springboot.crud1.controller;


import com.springboot.crud1.model.Animal;
import com.springboot.crud1.services.AnimalServiceimpl;
//import com.springboot.crud1.services.impl.AnimalServices;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Validated
@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalServiceimpl animalServiceimpl;

    public AnimalController(AnimalServiceimpl animalServiceimpl) {
        this.animalServiceimpl = animalServiceimpl;
    }
//
//    private final AnimalServices animalServices;
//
//    public AnimalController(AnimalServices animalServices) {
//        this.animalServices = animalServices;
//    }

    @GetMapping
    public List<Animal> findallAnimal(){
        return animalServiceimpl.findallAnimal();
    }

    @GetMapping("/{id}")
    public Optional<Animal> findAnimalById(@PathVariable("id") Long id){
        return animalServiceimpl.findById(id);
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody @Valid Animal animal){
        return animalServiceimpl.saveAnimal(animal);
    }

    @PutMapping
    public Animal updateAnimal(@PathVariable("id") Long id,@RequestBody @Valid Animal animal){
        return animalServiceimpl.updateAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public  void  deleteAnimal(@PathVariable("id") Long id){
        animalServiceimpl.deleteAnimal(id);
    }





}
