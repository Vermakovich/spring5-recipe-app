package com.vermakovich.spring5recipeapp.repositories;

import com.vermakovich.spring5recipeapp.domain.Category;
import com.vermakovich.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
