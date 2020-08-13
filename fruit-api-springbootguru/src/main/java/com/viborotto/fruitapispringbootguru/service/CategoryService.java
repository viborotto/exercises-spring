package com.viborotto.fruitapispringbootguru.service;

import com.viborotto.fruitapispringbootguru.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
