////
//////public class Main {
//////    public static void main(String[] args) {
//////        Student st = new Student("Ha Bich Ngoc", 20, "SV001", 8.5);
//////        st.displayInfo();
//////    }
//////}
//
////public class Main {
////    public static void main(String[] args) {
////        Animal a1 = new Dog();  // Animal tham chiếu đến Dog
////        Animal a2 = new Cat();  // Animal tham chiếu đến Cat
////
////        a1.sound(); // gọi phương thức của Dog
////        a2.sound(); // gọi phương thức của Cat
////    }
////}

//public class Main {
//    public static void main(String[] args) {
//        Manager m = new Manager("Nguyễn Văn B", 1500.0, "Phòng Kinh Doanh");
//        m.displayInfo();
//    }
//}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyễn Văn A", 5000, 1000));
        employees.add(new ProductionEmployee("Trần Thị B", 200, 20));

        double totalSalary = 0;
        for (Employee e : employees) {
            e.displayInfo();   // gọi đúng phương thức theo kiểu thực tế
            totalSalary += e.calculateSalary();
            System.out.println("--------------------");
        }

        System.out.println("Tổng lương phải trả: " + totalSalary);
    }
}
