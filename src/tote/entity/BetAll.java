package tote.entity;

import java.math.BigDecimal;

public class BetAll {

    private int state;

    private double resCoef;

    private Long id;

    private BigDecimal betValue;
    private BigDecimal winSum;

    private String catName;
    private String eventName;
    private String outcomeName;

    public BigDecimal getWinSum() {
        return winSum;
    }

    public void setWinSum(BigDecimal winSum) {
        this.winSum = winSum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
    }

    public BigDecimal getBetValue() {
        return betValue;
    }

    public void setBetValue(BigDecimal betValue) {
        this.betValue = betValue;
    }

    public double getResCoef() {
        return resCoef;
    }

    public void setResCoef(double resCoef) {
        this.resCoef = resCoef;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
