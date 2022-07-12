package tote.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.EventDao;
import tote.entity.Event;

public class EventMapper extends SqlSessionDaoSupport implements EventDao {

    @Override
    public void create(Event event) {
        getSqlSession().insert("tote.dao.EventDao.create", event);
    }

    @Override
    public Event read(Long id) {
        return getSqlSession().selectOne("tote.dao.EventDao.read", id);
    }

    @Override
    public void update(Event event) {
        getSqlSession().update("tote.dao.EventDao.update", event);
    }

    @Override
    public void delete(Long id) {
        getSqlSession().delete("tote.dao.EventDao.delete", id);
    }

    @Override
    public List<Event> findAll() {
        return getSqlSession().selectList("tote.dao.EventDao.findAll");
    }

}
