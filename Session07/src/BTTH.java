public class Student {

    
    private String id;
    private String name;

    public static int studentCount = 0;

    public static final String SCHOOL_NAME = "ABC University";

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;  
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Trường: " + SCHOOL_NAME);
        System.out.println("Mã SV: " + id);
        System.out.println("Tên SV: " + name);
        System.out.println("-----------------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + studentCount);
    }
}
