package com.springboot.crud1.Repository;

import com.springboot.crud1.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Animalrepository  extends JpaRepository<Animal,Long> {
}
