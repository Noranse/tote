package tote.service;

import java.util.List;

import tote.dao.BetDao;
import tote.entity.Bet;
import tote.entity.BetAll;

public class BetServiceImpl implements BetService {

    private BetDao dao;

    public void setDao(BetDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Bet bet) {
        if (bet.getId() == null) {
            dao.create(bet);
            System.out.println("create");
        } else {
            dao.update(bet);
            System.out.println("update");
        }
    }

    @Override
    public void add(Bet bet) {
        dao.create(bet);
    }

    @Override
    public List<Bet> getBets() {
        return dao.findAll();
    }

    @Override
    public Bet getBet(Long id) {
        return dao.read(id);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public List<BetAll> getBetsAll(Long userId) {
        return dao.findBetAll(userId);
    }
}
