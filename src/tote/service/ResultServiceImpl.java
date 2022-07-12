package tote.service;

import java.util.List;

import tote.dao.ResultDao;
import tote.entity.Result;

public class ResultServiceImpl implements ResultService {

    private ResultDao dao;

    public void setDao(ResultDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Result result) {
        if (result.getId() == null) {
            dao.create(result);
            System.out.println("create");
        } else {
            dao.update(result);
            System.out.println("update");
        }
    }

    @Override
    public List<Result> getResult() {
        return dao.findAll();
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Result getResult(Long id) {
        return dao.read(id);
    }

    @Override
    public void add(Result result) {
        dao.create(result);
    }

    @Override
    public List<Result> findByEventId(Long id) {
        return dao.findByEventId(id);
    }
}
