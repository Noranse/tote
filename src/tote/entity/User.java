package tote.entity;

import java.math.BigDecimal;
import java.util.List;

public class User extends Entity {

    private static final long serialVersionUID = 1L;

    private BigDecimal billValue;

    private String name;

    private String pass;

    private List<Role> roles;

    public User() {
    }

    public User(BigDecimal billValue, String name, String pass) {
        this(billValue, name, pass, null);
    }

    public User(BigDecimal billValue, String name, String pass, List<Role> roles) {
        this.billValue = billValue;
        this.name = name;
        this.pass = pass;
        this.roles = roles;
    }

    public BigDecimal getBillValue() {
        return billValue;
    }

    public void setBillValue(BigDecimal billValue) {
        this.billValue = billValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User [id =" + super.getId() + ", billValue=" + billValue + ", name=" + name + ", pass=" + pass + ", roles=" + roles + "]";
    }
}
