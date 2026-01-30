public class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    
public Student(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }
    
public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm TB: " + diemTrungBinh);
        System.out.println("----------------------------");
    }
}

