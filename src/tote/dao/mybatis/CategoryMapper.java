package tote.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.CategoryDao;
import tote.entity.Category;
import tote.entity.Event;

public class CategoryMapper extends SqlSessionDaoSupport implements CategoryDao {

    @Override
    public void create(Category categ) {
        getSqlSession().insert("tote.dao.CategoryDao.create", categ);
    }

    @Override
    public Category read(Long id) {
        return getSqlSession().selectOne("tote.dao.CategoryDao.read", id);
    }

    @Override
    public void update(Category categ) {
        getSqlSession().update("tote.dao.CategoryDao.update", categ);
    }

    @Override
    public void delete(Long id) {
        getSqlSession().delete("tote.dao.CategoryDao.delete", id);
    }

    @Override
    public List<Category> findAll() {
        return getSqlSession().selectList("tote.dao.CategoryDao.findAll");
    }

    @Override
    public List<Event> eventsByCatId(Long id) {
        return getSqlSession().selectList("tote.dao.CategoryDao.eventsByCatId");
    }

}
