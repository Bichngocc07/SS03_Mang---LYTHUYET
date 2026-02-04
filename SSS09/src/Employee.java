//public class Employee {
//    protected String name;
//    protected double baseSalary;
//
//    public Employee(String name, double baseSalary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    public void displayInfo() {
//        System.out.println("Tên nhân viên: " + name);
//        System.out.println("Lương cơ bản: " + baseSalary);
//    }
//}
public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương: " + calculateSalary());
    }
}

