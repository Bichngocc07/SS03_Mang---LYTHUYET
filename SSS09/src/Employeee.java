// Employee.java
public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Phương thức tính lương (sẽ được ghi đè ở lớp con)
    public double getSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương: " + getSalary());
    }
}
