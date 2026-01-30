public class Employee {

    private String maNV;
    private String tenNV;
    private double luong;

    public Employee() {
        this.maNV = "NULL";
        this.tenNV = "Chưa có tên";
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void display() {
        System.out.println("Mã NV : " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương : " + luong);
        System.out.println("----------------------------");
    }

}
