package com.vermakovich.spring5recipeapp.services;

import com.vermakovich.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getAllRecipes();
}

