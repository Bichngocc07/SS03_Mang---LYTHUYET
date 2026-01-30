public class Account {
    // ===== Thuộc tính (Attributes) =====
    private String username;
    private String password;
    private String email;

    // ===== Constructor =====
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // ===== Phương thức đổi mật khẩu =====
    public void changePassword(String newPassword) {
        if (newPassword == null || newPassword.length() < 6) {
            System.out.println("Mật khẩu mới không hợp lệ (>= 6 ký tự).");
        } else {
            this.password = newPassword;
            System.out.println("Đổi mật khẩu thành công!");
        }
    }

    // ===== Phương thức hiển thị thông tin (ẩn mật khẩu) =====
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******"); // ẩn mật khẩu
        System.out.println("---------------------------");
    }
}
