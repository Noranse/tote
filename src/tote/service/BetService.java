package tote.service;

import java.util.List;

import tote.entity.Bet;
import tote.entity.BetAll;

public interface BetService {

    void save(Bet bet);

    void add(Bet bet);

    Bet getBet(Long id);

    List<Bet> getBets();

    List<BetAll> getBetsAll(Long userId);

    void delete(Long id);

}
