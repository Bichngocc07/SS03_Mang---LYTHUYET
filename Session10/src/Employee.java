public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void showSalaryInfo() {
        System.out.println("Tên: " + name + " | Lương cuối cùng: " + calculateSalary());
    }
}

