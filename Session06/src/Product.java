public class Product {
    // ===== Thuộc tính (Encapsulation: private) =====
    private String maSP;
    private String tenSP;
    private double giaBan;

    // ===== Constructor =====
    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan); // dùng setter để kiểm soát dữ liệu
    }

    // ===== Getter =====
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    // ===== Setter =====
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    // Setter có kiểm tra dữ liệu
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.err.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    // ===== Phương thức hiển thị =====
    public void display() {
        System.out.println("Mã SP : " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá   : " + giaBan);
        System.out.println("----------------------------");
    }
}
