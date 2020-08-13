package com.viborotto.fruitapispringbootguru.mapper;

import com.viborotto.fruitapispringbootguru.model.Category;
import com.viborotto.fruitapispringbootguru.model.dto.CategoryDTO;
import org.mapstruct.*;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mapper.getMapper(CategoryMapper.class);

    @Mapping(source = "id", target="id")
    CategoryDTO categoryToCategoryDTO(Category category);
}
