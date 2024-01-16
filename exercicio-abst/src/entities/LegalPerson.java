package entities;

public class LegalPerson extends Person{

    private Integer employees;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double income, Integer employees) {
        super(name, income);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double taxCalculation() {
        double tax = 0;
        if (employees <= 0) {
            tax = getIncome() * 0.16;
        } else {
            tax = getIncome() * 0.14;
        }
        return tax;
    }
}
