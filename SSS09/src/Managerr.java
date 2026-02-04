// Manager.java
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // gọi constructor lớp cha
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return baseSalary + bonus;
    }
}
