package com.DevGabriel.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevGabriel.projeto.Services.CategoryService;
import com.DevGabriel.projeto.entities.Category;

@RestController
public class CategoryResource {

    @Autowired
    private CategoryService service;

    
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}
