package tote.dao.mybatis;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.BetDao;
import tote.entity.Bet;
import tote.entity.BetAll;

public class BetMapper extends SqlSessionDaoSupport implements BetDao {

    @Override
    public void create(Bet bet) {
        getSqlSession().insert("tote.dao.BetDao.create", bet);
    }

    @Override
    public Bet read(Long id) {
        return getSqlSession().selectOne("tote.dao.BetDao.read", id);
    }

    @Override
    public void update(Bet bet) {
        getSqlSession().update("tote.dao.BetDao.update", bet);
    }

    @Override
    public void delete(Long id) {
        getSqlSession().delete("tote.dao.BetDao.delete", id);
    }

    @Override
    public List<Bet> findAll() {
        return getSqlSession().selectList("tote.dao.BetDao.findAll");
    }

    @Override
    public List<BetAll> findBetAll(Long userId) {
        return getSqlSession().selectList("tote.dao.BetDao.findBetAll", userId);
    }
}
