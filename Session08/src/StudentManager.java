public class StudentManager {
    private Student[] listStudent;
    private int count;
    private final int MAX_SIZE = 100;

    public StudentManager() {
        this.listStudent = new Student[MAX_SIZE];
        this.count = 0;
    }

    // [FR1] Thêm sinh viên
    public void addStudent(Student sv) {
        if (count >= MAX_SIZE) {
            System.out.println("Lỗi: Danh sách đã đầy!");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getMaSV().equalsIgnoreCase(sv.getMaSV())) {
                System.out.println("Lỗi: Mã sinh viên đã tồn tại");
                return;
            }
        }

        listStudent[count] = sv;
        count++;
        System.out.println("Thêm thành công!!!");
    }

    // [FR2] Hiển thị danh sách sinh viên
    public void displayAll() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.printf("%-10s %-20s %-5s %-10s %-10s %-10s\n",
                "Mã SV", "Họ Tên", "Tuổi", "Giới Tính", "ĐTB", "Xếp Loại");
        for (int i = 0; i < count; i++) {
            Student s = listStudent[i];
            System.out.printf("%-10s %-20s %-5d %-10s %-10.2f %-10s\n",
                    s.getMaSV(), s.getHoTen(), s.getAge(),
                    s.getGioiTinh(), s.getDiemTB(), s.getXepLoai());
        }
    }

    // [FR3] Tìm kiếm sinh viên
    public void findStudent(String keyword) {
        boolean found = false;
        System.out.println("\n--- KẾT QUẢ TÌM KIẾM ---");

        for (int i = 0; i < count; i++) {
            if (listStudent[i].getMaSV().equalsIgnoreCase(keyword) ||
                    listStudent[i].getHoTen().toLowerCase().contains(keyword.toLowerCase())) {
                if (!found) {
                    System.out.printf("%-10s %-20s %-5s %-10s %-10s %-10s\n",
                            "Mã SV", "Họ Tên", "Tuổi", "Giới Tính", "ĐTB", "Xếp Loại");
                }

                Student s = listStudent[i];
                System.out.printf("%-10s %-20s %-5d %-10s %-10.2f %-10s\n",
                        s.getMaSV(), s.getHoTen(), s.getAge(),
                        s.getGioiTinh(), s.getDiemTB(), s.getXepLoai());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào với từ khóa: " + keyword);
        }
    }

    // [FR4] Cập nhật thông tin
    public void updateStudent(String maSV, String newTen, int newAge, double t, double l, double h) {
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getMaSV().equalsIgnoreCase(maSV)) {
                listStudent[i].setHoTen(newTen);
                listStudent[i].setAge(newAge);
                listStudent[i].setDiemToan(t);
                listStudent[i].setDiemLy(l);
                listStudent[i].setDiemHoa(h);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy mã SV cần cập nhật.");
    }

    // [FR5] Xóa sinh viên
    public void deleteStudent(String maSV) {
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getMaSV().equalsIgnoreCase(maSV)) {
                for (int j = i; j < count - 1; j++) {
                    listStudent[j] = listStudent[j + 1];
                }
                listStudent[count - 1] = null;
                count--;
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy mã SV để xóa.");
    }

    // [FR6] Tính điểm trung bình và xếp loại
    public void checkGrade(String maSV) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getMaSV().equalsIgnoreCase(maSV)) {
                Student s = listStudent[i];

                System.out.println("\n--- THÔNG TIN KẾT QUẢ ---");
                System.out.println("Mã SV: " + s.getMaSV());
                System.out.println("Họ tên: " + s.getHoTen());

                double avg = s.getDiemTB();
                String rank = s.getXepLoai();

                System.out.printf("Điểm trung bình: %.2f\n", avg);
                System.out.println("Xếp loại: " + rank);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Lỗi: Không tìm thấy sinh viên có mã " + maSV);
        }
    }

    // [FR7] Sắp xếp
    public void sortByGPA() { // Bubble Sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (listStudent[j].getDiemTB() < listStudent[j + 1].getDiemTB()) {
                    Student temp = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo ĐTB giảm dần.");
    }
    // Sắp xếp tên A-Z (Selection Sort)
    public void sortByName() {
        for (int i = 0; i < count - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < count; j++) {
                if (listStudent[j].getHoTen().compareToIgnoreCase(listStudent[minIdx].getHoTen()) < 0) {
                    minIdx = j;
                }
            }
            Student temp = listStudent[minIdx];
            listStudent[minIdx] = listStudent[i];
            listStudent[i] = temp;
        }
        System.out.println("Đã sắp xếp danh sách theo tên A-Z.");
    }

    // [FR8] Thống kê
    public void showStatistics() {
        if (count == 0) return;
        int g = 0, k = 0, tb = 0, y = 0;
        double max = listStudent[0].getDiemTB();
        for (int i = 0; i < count; i++) {
            String xl = listStudent[i].getXepLoai();
            if (xl.equals("Giỏi")) g++;
            else if (xl.equals("Khá")) k++;
            else if (xl.equals("Trung bình")) tb++;
            else y++;
            if (listStudent[i].getDiemTB() > max) max = listStudent[i].getDiemTB();
        }
        System.out.println("Thống kê: Giỏi:" + g + ", Khá:" + k + ", TB:" + tb + ", Yếu:" + y);
        System.out.println("Điểm cao nhất: " + max);
    }
}