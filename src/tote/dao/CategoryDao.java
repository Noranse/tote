package tote.dao;

import tote.entity.Event;
import java.util.List;

import tote.entity.Category;

public interface CategoryDao extends CrudDao<Long, Category> {
    List<Category> findAll();

    List<Event> eventsByCatId(Long id);
}
