package com.crazzy.springframeworkguru.api;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/recipe")
@Slf4j
public class RecipeApi {

    private RecipeService recipeService;

    public RecipeApi(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping()
    public Set<Recipe> findAll() {
        Set<Recipe> all = recipeService.findAll();
        log.info(all.toString());
        return all;
    }
}
