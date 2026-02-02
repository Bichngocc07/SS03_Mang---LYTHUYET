public class ClassRoom {

    // ===== BIẾN DÙNG CHUNG CHO CẢ LỚP (STATIC) =====
    private static double classFund = 0.0;

    // ===== BIẾN RIÊNG CỦA TỪNG SINH VIÊN (INSTANCE) =====
    private String studentName;

    // Constructor
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // Sinh viên đóng tiền vào quỹ chung
    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;   // TÁC ĐỘNG VÀO BIẾN STATIC
            System.out.println(studentName + " đã đóng: " + amount);
        } else {
            System.out.println("Số tiền phải lớn hơn 0!");
        }
    }

    // Xem tổng quỹ lớp (static vì thuộc về cả lớp)
    public static double getClassFund() {
        return classFund;
    }

    public String getStudentName() {
        return studentName;
    }
}
