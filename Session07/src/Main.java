public class Main {
    public static void main(String[] args) {

//        Student s1 = new Student("SV001", "Hà Bích Ngọc");
//        Student s2 = new Student("SV002", "Hồ Khánh Linh");
//        Student s3 = new Student("SV003", "Nguyễn Hữu Đại");
//
//        s1.displayInfo();
//        s2.displayInfo();
//        s3.displayInfo();
//        System.out.println("===> Tổng sinh viên: "
//                + Student.getTotalStudent());
        // ======== PHẦN 1: BIẾN NGUYÊN THỦY (PRIMITIVE) ========
//        int originalValue = 10;
//        int copiedValue = originalValue;   // sao chép giá trị
//
//        System.out.println("=== Primitive before change ===");
//        System.out.println("originalValue = " + originalValue);
//        System.out.println("copiedValue = " + copiedValue);
//
//        // Thay đổi biến thứ hai
//        copiedValue = 20;
//
//        System.out.println("=== Primitive after change ===");
//        System.out.println("originalValue = " + originalValue); // không đổi
//        System.out.println("copiedValue = " + copiedValue);     // thay đổi
//
//        System.out.println("\n----------------------------------\n");
//
//        // ======== PHẦN 2: BIẾN THAM CHIẾU (REFERENCE) ========
//        Student studentA = new Student("SV01", "An");
//        Student studentB = studentA;   // cùng trỏ tới 1 đối tượng
//
//        System.out.println("=== Reference before change ===");
//        studentA.display();
//        studentB.display();
//
//        // Thay đổi qua studentB
//        studentB.setName("Bình");
//
//        System.out.println("=== Reference after change ===");
//        studentA.display(); // bị đổi theo
//        studentB.display();
//        double[] scores = {6.5, 8.0, 4.5};
//
//        System.out.print("Danh sách điểm: ");
//        for (int i = 0; i < scores.length; i++) {
//            System.out.print(scores[i]);
//            if (i < scores.length - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        // Gọi trực tiếp qua tên lớp ScoreUtils
//        double avg = ScoreUtils.calculateAverage(scores);
//
//        System.out.println("\n\n>> Kết quả xử lý:");
//        System.out.printf("- Điểm trung bình cả lớp: %.2f%n", avg);
//
//        for (double s : scores) {
//            boolean pass = ScoreUtils.checkPass(s);
//            System.out.println("- Điểm " + s + ": "
//                    + (pass ? "Đạt" : "Trượt"));
//        }
//        ClassRoom sv1 = new ClassRoom("Nguyễn Văn A");
//        ClassRoom sv2 = new ClassRoom("Trần Thị B");
//        ClassRoom sv3 = new ClassRoom("Lê Văn C");
//
//        sv1.contribute(100_000);
//        sv2.contribute(150_000);
//        sv3.contribute(200_000);
//
//        System.out.println("\n=== TỔNG QUỸ LỚP ===");
//        System.out.println("Quỹ hiện tại: "
//                + ClassRoom.getClassFund() + " VNĐ");
        // double[] scores = {6.5, 8.0, 4.5, 10.0};

        // System.out.println("=== KIỂM TRA ĐIỂM ===");
        // System.out.println("Thang điểm: "
        //         + Config.MIN_SCORE + " → " + Config.MAX_SCORE);
        // System.out.println("Điểm đạt: " + Config.PASS_SCORE);
        // System.out.println();

        // for (double s : scores) {

        //     // Kiểm tra hợp lệ theo hằng số
        //     if (s < Config.MIN_SCORE || s > Config.MAX_SCORE) {
        //         System.out.println("Điểm " + s + " KHÔNG HỢP LỆ!");
        //         continue;
        //     }

        //     String result = (s >= Config.PASS_SCORE) ? "Đạt" : "Trượt";
        //     System.out.println("Điểm " + s + ": " + result);
        Student s1 = new Student("SV001", "Nguyễn Văn A");
        Student s2 = new Student("SV002", "Trần Thị B");
        Student s3 = new Student("SV003", "Lê Văn C");

        // Gọi phương thức INSTANCE (từng sinh viên riêng)
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // Gọi phương thức STATIC (dữ liệu dùng chung)
        Student.showTotalStudent();
        }
    }
}
