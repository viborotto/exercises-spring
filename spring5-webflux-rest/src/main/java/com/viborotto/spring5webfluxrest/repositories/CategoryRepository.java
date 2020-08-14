package com.viborotto.spring5webfluxrest.repositories;

import com.viborotto.spring5webfluxrest.model.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
