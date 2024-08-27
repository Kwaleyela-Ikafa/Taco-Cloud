package com.ikafa.taco_cloud.repository;

import java.util.Optional;

import com.ikafa.taco_cloud.entities.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
