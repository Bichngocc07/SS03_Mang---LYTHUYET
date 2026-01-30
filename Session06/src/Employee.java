public class Employee {

    // ===== Thuộc tính =====
    private String maNV;
    private String tenNV;
    private double luong;

    // ===== Constructor không tham số =====
    public Employee() {
        this.maNV = "NULL";
        this.tenNV = "Chưa có tên";
        this.luong = 0;
    }

    // ===== Constructor có mã + tên =====
    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    // ===== Constructor đầy đủ =====
    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    // ===== Phương thức hiển thị =====
    public void display() {
        System.out.println("Mã NV : " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương : " + luong);
        System.out.println("----------------------------");
    }
}