package com.viborotto.fruitapispringbootguru.service;

import com.viborotto.fruitapispringbootguru.controller.CategoryController;
import com.viborotto.fruitapispringbootguru.mapper.CategoryMapper;
import com.viborotto.fruitapispringbootguru.model.dto.CategoryDTO;
import com.viborotto.fruitapispringbootguru.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }
    private String getCategoryURL(Long id) {
        return CategoryController.BASE_URL + "/" + id;
    }
}
