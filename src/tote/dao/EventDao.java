package tote.dao;

import java.util.List;

import tote.entity.Event;

public interface EventDao extends CrudDao<Long, Event> {
    List<Event> findAll();
}
