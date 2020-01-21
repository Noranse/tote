package tote.service;

import java.util.List;

import tote.entity.Result;

public interface ResultService {

    void save(Result result);

    void add(Result result);

    Result getResult(Long id);

    List<Result> getResult();

    void delete(Long id);

    List<Result> findByEventId(Long id);
}
