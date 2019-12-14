package com.crazzy.springframeworkguru.service.impl;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.repositories.RecipeRepository;
import com.crazzy.springframeworkguru.service.RecipeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> findAll() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
