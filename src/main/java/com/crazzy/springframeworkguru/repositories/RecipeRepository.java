package com.crazzy.springframeworkguru.repositories;

import com.crazzy.springframeworkguru.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
