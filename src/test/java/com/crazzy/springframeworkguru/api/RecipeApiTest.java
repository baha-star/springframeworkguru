package com.crazzy.springframeworkguru.api;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.service.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class RecipeApiTest {

    private RecipeApi recipeApi;
    private MockMvc mockMvc;

    @Mock
    private RecipeService recipeService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeApi = new RecipeApi(recipeService);

        mockMvc = MockMvcBuilders.standaloneSetup(recipeApi).build();
    }

    @Test
    public void findAll() {

        Recipe recipe = new Recipe();
        HashSet<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);

        when(recipeService.findAll()).thenReturn(recipes);

        Set<Recipe> all = recipeApi.findAll();
        assertEquals(all.size(), 1);
        verify(recipeService, times(1)).findAll();
    }

    @Test
    public void api() throws Exception {
        mockMvc.perform(get("/recipe"))
                .andExpect(status().isOk());
    }
}
