package com.viborotto.spring5webfluxrest.controllers;

import com.viborotto.spring5webfluxrest.model.Category;
import com.viborotto.spring5webfluxrest.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //ReactiveTypes: Mono is a zero or one elements, and Flux is zero or many elements
    @GetMapping("/api/vi/categories")
    public Flux<Category> list(){
        return categoryRepository.findAll();
    }

    @GetMapping("/api/vi/categories/{id}")
    Mono<Category> getById(@PathVariable String id){
        return categoryRepository.findById(id);
    }
}
