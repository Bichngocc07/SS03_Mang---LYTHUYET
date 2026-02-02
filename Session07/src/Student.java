//public class Student {
//    private String id;
//    private String name;
//
//
//    private static int totalStudent = 0;
//
//    public Student(String id, String name) {
//        this.id = id;
//        this.name = name;
//        totalStudent++;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static int getTotalStudent() {
//        return totalStudent;
//    }
//
//    public void displayInfo() {
//        System.out.println("Mã SV: " + id);
//        System.out.println("Tên SV: " + name);
//        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
//        System.out.println("-----------------------------");
//    }

//}
public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student{name='" + name + "'}");
    }
}
