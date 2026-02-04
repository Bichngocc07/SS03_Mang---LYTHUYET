// Developer.java
public class Developer extends Employeee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double getSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}
