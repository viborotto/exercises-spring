package com.viborotto.fruitapispringbootguru.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
