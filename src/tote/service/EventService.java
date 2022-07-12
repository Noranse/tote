package tote.service;

import java.util.List;

import tote.entity.Event;

public interface EventService {

    void save(Event event);

    void add(Event event);

    Event getEvent(Long id);

    List<Event> getEvent();

    void delete(Long id);
}
