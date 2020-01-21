package tote.entity;

public class Result extends Entity {

    private static final long serialVersionUID = 1L;

    private int state;

    private Long idEvent;

    private Double coef;

    private String name;

    public Result() {
    }

    public Result(String name, Double coef, Long idEvent) {
        super();
        this.name = name;
        this.coef = coef;
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCoef() {
        return coef;
    }

    public void setCoef(Double coef) {
        this.coef = coef;
    }

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
