package tote.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.ResultDao;
import tote.entity.Result;

public class ResultMapper extends SqlSessionDaoSupport implements ResultDao {

    @Override
    public void create(Result result) {
        getSqlSession().insert("tote.dao.ResultDao.create", result);
    }

    @Override
    public Result read(Long id) {
        return getSqlSession().selectOne("tote.dao.ResultDao.read", id);
    }

    @Override
    public void update(Result result) {
        getSqlSession().update("tote.dao.ResultDao.update", result);
    }

    @Override
    public void delete(Long id) {
        getSqlSession().delete("tote.dao.ResultDao.delete", id);
    }

    @Override
    public List<Result> findAll() {
        return getSqlSession().selectList("tote.dao.ResultDao.findAll");
    }

    @Override
    public List<Result> findByEventId(Long id) {
        return getSqlSession().selectList("tote.dao.ResultDao.findByEventId", id);
    }

}
