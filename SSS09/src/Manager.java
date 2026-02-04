// Manager.java
public class Manager extends Employee {
    private String department;

    // Constructor sử dụng super() để gọi constructor lớp cha
    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); // phải là dòng đầu tiên
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    // Ghi đè phương thức hiển thị thông tin
    @Override
    public void displayInfo() {
        super.displayInfo(); // gọi lại phương thức lớp cha
        System.out.println("Phòng ban: " + department);
    }
}
