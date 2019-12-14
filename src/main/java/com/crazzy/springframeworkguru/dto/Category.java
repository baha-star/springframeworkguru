package com.crazzy.springframeworkguru.dto;

import com.crazzy.springframeworkguru.entity.Recipe;

import java.util.Set;

public class Category {
    private Long id;
    private String description;
    private Set<Recipe> recipes;
}
