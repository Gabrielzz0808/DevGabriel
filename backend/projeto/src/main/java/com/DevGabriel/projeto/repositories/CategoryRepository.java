package com.DevGabriel.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DevGabriel.projeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
