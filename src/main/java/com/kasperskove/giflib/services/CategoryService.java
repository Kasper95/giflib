package com.kasperskove.giflib.services;

import com.kasperskove.giflib.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(long id);

    void save (Category category);

    void delete (Category category);
}
