package exercicio17.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee() {
    }

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double netSalary(){
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        grossSalary = (getGrossSalary() * percentage / 100) + getGrossSalary();
        netSalary();
    }

    @Override
    public String toString() {
        return getName() + ", R$ " + String.format("%.2f", netSalary());
    }
}
