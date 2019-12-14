package com.crazzy.springframeworkguru.service.impl;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    private RecipeServiceImpl recipeService;

    @Mock
    private RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void findAll() {

        Recipe recipe = new Recipe();
        HashSet<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipes);

        Set<Recipe> all = recipeService.findAll();
        assertEquals(all.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}
