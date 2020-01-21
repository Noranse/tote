package tote.entity;

import java.math.BigDecimal;

public class Bet extends Entity {

    private static final long serialVersionUID = 1L;

    private Long idUser;

    private Long idRes;

    private BigDecimal betValue;

    public Bet() {
    }

    public Bet(BigDecimal betValue, Long idUser, Long idRes) {
        this.betValue = betValue;
        this.idUser = idUser;
        this.idRes = idRes;
    }

    public BigDecimal getBetValue() {
        return betValue;
    }

    public void setBetValue(BigDecimal betValue) {
        this.betValue = betValue;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Long getIdRes() {
        return idRes;
    }

    public void setIdRes(Long idRes) {
        this.idRes = idRes;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
