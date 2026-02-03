import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("==== QUẢN LÝ SINH VIÊN ====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Cập nhật sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Tính điểm trung bình");
            System.out.println("7. Sắp xếp sinh viên");
            System.out.println("8. Thống kê");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng (1-9): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // [FR1] Thêm sinh viên mới
                    System.out.println("--- NHẬP THÔNG TIN SINH VIÊN ---");
                    System.out.print("Mã SV: "); String id = sc.nextLine();
                    System.out.print("Họ tên: "); String name = sc.nextLine();

                    int age;
                    do {
                        System.out.print("Tuổi (18-30): "); age = sc.nextInt();
                    } while (age < 18 || age > 30);
                    sc.nextLine();

                    System.out.print("Giới tính: "); String sex = sc.nextLine();
                    System.out.print("Điểm Toán: "); double t = sc.nextDouble();
                    System.out.print("Điểm Lý: "); double l = sc.nextDouble();
                    System.out.print("Điểm Hóa: "); double h = sc.nextDouble();
                    sc.nextLine();
                    manager.addStudent(new Student(id, name, age, sex, t, l, h));
                    break;

                case 2: // [FR2] Hiển thị
                    manager.displayAll();
                    break;

                case 3: // [FR3] Tìm kiếm
                    System.out.print("Nhập mã hoặc tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.findStudent(keyword);
                    break;

                case 4: // [FR4] Cập nhật
                    System.out.print("Nhập mã SV cần cập nhật: ");
                    String updateId = sc.nextLine();

                    System.out.print("Tên mới: "); String newName = sc.nextLine();
                    System.out.print("Tuổi mới: "); int newAge = sc.nextInt();
                    System.out.print("Điểm Toán mới: "); double nt = sc.nextDouble();
                    System.out.print("Điểm Lý mới: "); double nl = sc.nextDouble();
                    System.out.print("Điểm Hóa mới: "); double nh = sc.nextDouble();
                    sc.nextLine();

                    manager.updateStudent(updateId, newName, newAge, nt, nl, nh);
                    break;

                case 5: // [FR5] Xóa
                    System.out.print("Nhập mã SV cần xóa: ");
                    String deleteId = sc.nextLine();
                    System.out.print("Bạn có chắc chắn muốn xóa? (Y/N): ");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        manager.deleteStudent(deleteId);
                    }
                    break;

                case 6: // [FR6] Tính điểm TB và xếp loại
                    System.out.print("Nhập mã SV cần xem xếp loại: ");
                    String checkId = sc.nextLine();
                    manager.checkGrade(checkId);
                    break;

                case 7: // [FR7] Sắp xếp
                    System.out.println("--- CHỌN TIÊU CHÍ SẮP XẾP ---");
                    System.out.println("1. Sắp xếp theo Điểm TB giảm dần (Bubble Sort)");
                    System.out.println("2. Sắp xếp theo Tên A-Z (Selection Sort)");
                    System.out.print("Lựa chọn của bạn: ");
                    int sortChoice = sc.nextInt();
                    sc.nextLine();

                    if (sortChoice == 1) {
                        manager.sortByGPA();
                    } else if (sortChoice == 2) {
                        manager.sortByName();
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;

                case 8: // [FR8] Thống kê
                    manager.showStatistics();
                    break;

                case 9: // Thoát
                    System.out.println("Đang thoát...");
                    break;
                default: // Lựa chọn không hợp lệ
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại !!!");
                    break;
            }
        } while (choice != 9);
    }
}