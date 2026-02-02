public class ClassRoom {
    private static double classFund = 0.0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng: " + amount);
        } else {
            System.out.println("Số tiền phải lớn hơn 0!");
        }
    }

    public static double getClassFund() {
        return classFund;
    }

    public String getStudentName() {
        return studentName;
    }
}

