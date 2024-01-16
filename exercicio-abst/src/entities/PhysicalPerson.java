package entities;

public class PhysicalPerson extends Person {

    private Double health;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double income, Double health) {
        super(name, income);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public Double taxCalculation() {
        double tax;
        if (getIncome() < 20000) {
            if (health > 0) {
                tax = (getIncome() * 0.15) - (health * 0.50);
            } else {
                tax = getIncome() * 0.15;
            }
        } else {
            if (health > 0) {
                tax = (getIncome() * 0.25) - (health * 0.50);
            } else {
                tax = getIncome() * 0.25;
            }
        }
        return tax;
    }
}
