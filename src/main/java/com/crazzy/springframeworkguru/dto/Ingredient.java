package com.crazzy.springframeworkguru.dto;

import com.crazzy.springframeworkguru.entity.Recipe;
import com.crazzy.springframeworkguru.entity.UnitOfMeasure;

import java.math.BigDecimal;

public class Ingredient {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
    private Recipe recipe;
}
