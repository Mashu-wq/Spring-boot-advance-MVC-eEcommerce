package com.zeroo8.E_commerce.service;

import com.zeroo8.E_commerce.payload.CategoryDTO;
import com.zeroo8.E_commerce.payload.CategoryResponse;
import jakarta.validation.Valid;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder     );

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);


    CategoryDTO updateCategory(@Valid CategoryDTO category, Long categoryId);


}
