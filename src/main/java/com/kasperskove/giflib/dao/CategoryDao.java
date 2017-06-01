package com.kasperskove.giflib.dao;

import com.kasperskove.giflib.entities.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> findAll();

    Category findById(long id);

    void save (Category category);

    void delete (Category category);
}
