public class Student {
    private String maSV;
    private String hoTen;
    private int age;
    private String gioiTinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Student(String maSV, String hoTen, int age, String gioiTinh, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.age = age;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemTB() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public String getXepLoai() {
        double avg = getDiemTB();
        if (avg >= 8.0 && diemToan >= 6.5 && diemLy >= 6.5 && diemHoa >= 6.5) {
            return "Giỏi";
        } else if (avg >= 6.5 && diemToan >= 5.0 && diemLy >= 5.0 && diemHoa >= 5.0) {
            return "Khá";
        } else if (avg >= 5.0 && diemToan >= 3.5 && diemLy >= 3.5 && diemHoa >= 3.5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}