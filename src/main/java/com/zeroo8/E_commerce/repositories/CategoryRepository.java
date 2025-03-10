package com.zeroo8.E_commerce.repositories;

import com.zeroo8.E_commerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    Category findByCategoryName(String categoryName);
}
