// Student.java
public class Student extends Person {
    private String studentId;
    private double gpa;

    // Constructor
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // gọi constructor lớp cha
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Ghi đè phương thức hiển thị thông tin
    @Override
    public void displayInfo() {
        super.displayInfo(); // dùng lại code lớp cha
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
