package com.crazzy.springframeworkguru.service.impl;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.exception.NotFoundException;
import com.crazzy.springframeworkguru.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
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

    @Test
    public void findById() {

        Long id = 1L;

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        when(recipeRepository.findById(id)).thenReturn(Optional.of(recipe));

        Recipe byId = recipeService.findById(id);

        assertEquals(id, byId.getId());
    }

    @Test(expected = NotFoundException.class)
    public void findByIdElse() {

        Long id = 1L;

        Optional<Recipe> recipe = Optional.empty();

        when(recipeRepository.findById(id)).thenReturn(recipe);

        recipeService.findById(id);

    }
}
