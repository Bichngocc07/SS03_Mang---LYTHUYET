public class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.err.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    public void display() {
        System.out.println("Mã SP : " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá   : " + giaBan);
        System.out.println("----------------------------");
    }
}

