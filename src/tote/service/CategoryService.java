package tote.service;

import java.util.List;

import tote.entity.Category;
import tote.entity.Event;

public interface CategoryService {

    void save(Category category);

    void add(Category category);

    Category getCategory(Long id);

    List<Category> getCategory();

    List<Event> getEventsByCategory(Long id);

    void delete(Long id);

}
