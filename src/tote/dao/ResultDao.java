package tote.dao;

import java.util.List;

import tote.entity.Result;

public interface ResultDao extends CrudDao<Long, Result> {
    List<Result> findAll();

    List<Result> findByEventId(Long id);
}
