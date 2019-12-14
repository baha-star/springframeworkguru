package com.crazzy.springframeworkguru.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    private Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 2L;

        category.setId(id);

        assertEquals(id, category.getId());
    }
}
