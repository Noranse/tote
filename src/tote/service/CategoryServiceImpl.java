package tote.service;

import java.util.List;

import tote.dao.CategoryDao;
import tote.entity.Category;
import tote.entity.Event;

public class CategoryServiceImpl implements CategoryService {

    private CategoryDao dao;

    public void setDao(CategoryDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Category category) {
        if (category.getId() == null) {
            dao.create(category);
            System.out.println("create");
        } else {
            dao.update(category);
            System.out.println("update");
        }
    }

    @Override
    public void add(Category category) {
        dao.create(category);
    }

    @Override
    public Category getCategory(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Category> getCategory() {
        return dao.findAll();
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public List<Event> getEventsByCategory(Long id) {
        return dao.eventsByCatId(id);
    }
}
