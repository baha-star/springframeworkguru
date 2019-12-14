package com.crazzy.springframeworkguru.api;

import com.crazzy.springframeworkguru.entity.Category;
import com.crazzy.springframeworkguru.repositories.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryApi {

    private CategoryRepository categoryRepository;

    public CategoryApi(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping()
    public void findByDescription() {
        Optional<Category> byDescription = categoryRepository.findByDescription("American");
        log.debug("Category ID: " + byDescription.get().getId());
    }
}
