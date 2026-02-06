// Abstract class Employee
public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Phương thức trừu tượng để tính lương
    public abstract double calculateSalary();

    // Phương thức hiển thị thông tin chung
    public void showSalaryInfo() {
        System.out.println("Tên: " + name + " | Lương cuối cùng: " + calculateSalary());
    }
}
