package com.vermakovich.spring5recipeapp.repositories;

import com.vermakovich.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository uomRepository;

    @Test
    public void findByDescription() {
        Optional<UnitOfMeasure> teaspoonOptional = uomRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", teaspoonOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> cupOptional = uomRepository.findByDescription("Cup");
        assertEquals("Cup", cupOptional.get().getDescription());
    }
}