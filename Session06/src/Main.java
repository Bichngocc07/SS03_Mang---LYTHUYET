public class Main {
    public static void main(String[] args) {
//SS01//
//        // ===== Khởi tạo object (đối tượng) =====
//        Student sv1 = new Student("SV001", "Nguyễn Văn A", 2004, 8.5);
//        Student sv2 = new Student("SV002", "Trần Thị B", 2003, 7.9);
//
//        // ===== Gọi phương thức hiển thị =====
//        sv1.hienThiThongTin();
//        sv2.hienThiThongTin();
// SS02//
//        Account acc1 = new Account("user01", "123456", "user01@gmail.com");
//
//        // ===== Hiển thị thông tin ban đầu =====
//        System.out.println("Thông tin ban đầu:");
//        acc1.displayInfo();
//
//        // ===== Đổi mật khẩu =====
//        acc1.changePassword("newpass123");
//
//        // ===== Hiển thị sau khi đổi =====
//        System.out.println("Sau khi đổi mật khẩu:");
//        acc1.displayInfo();
//    }
//SS03//
        // ===== Tạo sản phẩm =====
//        Product p1 = new Product("SP01", "Laptop Dell", 15000000);
//
//        // ===== Hiển thị ban đầu =====
//        System.out.println("Thông tin ban đầu:");
//        p1.display();
//
//        // ===== Thử set giá không hợp lệ =====
//        System.out.println("Thử set giá = -5000");
//        p1.setGiaBan(-5000);   // không hợp lệ
//
//        // ===== Hiển thị lại =====
//        System.out.println("Sau khi set giá không hợp lệ:");
//        p1.display();
//
//        // ===== Set giá hợp lệ =====
//        System.out.println("Set giá hợp lệ = 18000000");
//        p1.setGiaBan(18000000);
//
//        // ===== Hiển thị cuối =====
//        System.out.println("Sau khi set giá hợp lệ:");
//        p1.display();
// SS04//
//        // ===== Tạo object bằng constructor không tham số =====
//        Employee e1 = new Employee();
//
//        // ===== Tạo object bằng constructor (mã + tên) =====
//        Employee e2 = new Employee("NV01", "Nguyễn Văn A");
//
//        // ===== Tạo object bằng constructor đầy đủ =====
//        Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);
//
//        // ===== Hiển thị thông tin =====
//        System.out.println("Nhân viên 1:");
//        e1.display();
//
//        System.out.println("Nhân viên 2:");
//        e2.display();
//
//        System.out.println("Nhân viên 3:");
//        e3.display();
// SS05//
//        Book b1 = new Book("B01", "Clean Code", "Robert C. Martin", 250000);
//        Book b2 = new Book("B02", "Effective Java", "Joshua Bloch", 300000);
//
//        // ===== Hiển thị =====
//        b1.display();
//        b2.display();
        // ===== User hợp lệ =====
        User u1 = new User("U01", "admin", "123456", "admin@gmail.com");

        // ===== Email sai =====
        User u2 = new User("U02", "user01", "abc123", "user01gmail.com");

        // ===== Password rỗng =====
        User u3 = new User("U03", "user02", "", "user02@gmail.com");

        // ===== Hiển thị =====
        System.out.println("User 1:");
        u1.display();

        System.out.println("User 2:");
        u2.display();

        System.out.println("User 3:");
        u3.display();

        // ===== Test setter =====
        System.out.println("Test setEmail sai:");
        u1.setEmail("abc@@gmail..com");

        System.out.println("Test setPassword rỗng:");
        u1.setPassword("");

        System.out.println("Sau test:");
        u1.display();
    }
// SS05//
}



