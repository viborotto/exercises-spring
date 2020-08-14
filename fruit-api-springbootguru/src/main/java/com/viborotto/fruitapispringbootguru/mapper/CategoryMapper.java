package com.viborotto.fruitapispringbootguru.mapper;

import com.viborotto.fruitapispringbootguru.model.Category;
import com.viborotto.fruitapispringbootguru.model.dto.CategoryDTO;
import org.mapstruct.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "id", target="id")
    CategoryDTO categoryToCategoryDTO(Category category);
}
