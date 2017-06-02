package com.kasperskove.giflib.dao;

import com.kasperskove.giflib.entities.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Category> findAll() {

        // Open a session
        Session session = sessionFactory.openSession();

        // Get all categories with a Hibernate criteria
        List<Category> categories = session.createCriteria(Category.class).list();

        session.close();
        return categories;
    }

    @Override
    public Category findById(long id) {
        return null;
    }

    @Override
    public void save(Category category) {
        // open session
        Session session = sessionFactory.openSession();

        // begin transaction
        session.beginTransaction();

        // save the category
        session.save(category);

        // commit transaction
        session.getTransaction().commit();

        //close session
        session.close();
    }

    @Override
    public void delete(Category category) {

    }
}

