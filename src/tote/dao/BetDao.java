package tote.dao;

import java.util.List;

import tote.entity.Bet;
import tote.entity.BetAll;

public interface BetDao extends CrudDao<Long, Bet> {
    List<Bet> findAll();

    List<BetAll> findBetAll(Long userId);
}
