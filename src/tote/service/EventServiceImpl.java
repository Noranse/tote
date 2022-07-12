package tote.service;

import java.util.Collections;
import java.util.List;

import tote.dao.EventDao;
import tote.entity.Event;

public class EventServiceImpl implements EventService {

    private EventDao dao;

    public void setDao(EventDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Event event) {
        if (event.getId() == null) {
            dao.create(event);
            System.out.println("create");
        } else {
            dao.update(event);
            System.out.println("update");
        }
    }

    @Override
    public void add(Event event) {
        dao.create(event);
    }

    @Override
    public Event getEvent(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Event> getEvent() {
        List<Event> list = dao.findAll();
        Collections.reverse(list);
        return list;
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
