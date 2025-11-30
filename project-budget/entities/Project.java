package exercicio19.entities;

public class Project {
    private String name;
    private Double totalBudget;
    private Double spent;

    public Project(){
    }

    public Project(String name, Double totalBudget, Double spent) {
        this.name = name;
        this.totalBudget = totalBudget;
        this.spent = spent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(Double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }

    public double remainingBudget(){
        return getTotalBudget() - getSpent();
    }

    public void addExpense(double amount){
        spent += amount;
    }
}
