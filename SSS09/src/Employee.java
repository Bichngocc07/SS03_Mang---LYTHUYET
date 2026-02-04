//// Employee.java
//public class Employee {
//    protected String name;
//    protected double baseSalary;
//
//    // Constructor có tham số
//    public Employee(String name, double baseSalary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    // Phương thức hiển thị thông tin
//    public void displayInfo() {
//        System.out.println("Tên nhân viên: " + name);
//        System.out.println("Lương cơ bản: " + baseSalary);
//    }
//}
// Employee.java
public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng để các lớp con tự định nghĩa
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương: " + calculateSalary());
    }
}
