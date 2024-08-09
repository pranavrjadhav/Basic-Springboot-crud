package com.springboot.crud1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.springboot.crud1.Repository.Animalrepository;
import com.springboot.crud1.model.Animal;
import com.springboot.crud1.services.AnimalServiceimpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@DataJpaTest
@RunWith(SpringRunner.class)
//@SpringBootTest
class Crud1ApplicationTests {

  @Autowired
  private AnimalServiceimpl animalServiceimpl;

  @MockBean
  private Animalrepository animalrepository;
	@Test
    public void contextLoads() {
        when(animalrepository.findAll()).thenReturn(
                Stream.of(
                        new Animal(1L, "Pranav", "Jadhav"),
                        new Animal(2L, "Vaishnav", "Jadhav")

                ).collect(Collectors.toList())
        );
		assertEquals(2,animalServiceimpl.findallAnimal().size(),"there is an error pranav *******************************************-----------++++++++++**********");
	}

    @Test
    public void Byid(){
        Long a = 1L;
        when(animalrepository.findById(a))
                .thenReturn(Optional.of(new Animal(1L,"Pranav","Goha") {
                }));
        assertTrue(animalServiceimpl.findById(a).isPresent());
    }

    @Test
    public void bysave(){
        Animal animal4 = new Animal(3L,"rajan","kholi");
        when(animalrepository.save(animal4)).thenReturn(animal4);
        assertEquals(animal4,animalServiceimpl.saveAnimal(animal4));

    }

    @Test
    public void del(){
        Long a5 = 3L;

        Optional<Animal> animal5 = animalrepository.findById(a5);
        if (animal5.isPresent()) {
            Animal animal = animal5.get();

        }
    }


    }



