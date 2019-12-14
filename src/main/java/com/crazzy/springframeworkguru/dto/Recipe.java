package com.crazzy.springframeworkguru.dto;



import java.util.HashSet;
import java.util.Set;

public class Recipe {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<Ingredient> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private Notes notes;
    private Set<Category> categories = new HashSet<>();
}
