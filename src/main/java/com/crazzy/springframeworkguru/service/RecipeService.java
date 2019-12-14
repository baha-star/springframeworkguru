package com.crazzy.springframeworkguru.service;

import com.crazzy.springframeworkguru.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> findAll();
}
