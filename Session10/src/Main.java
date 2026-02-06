////////////Ss1
//////////public class Main {
//////////    interface Shape {
//////////        double getArea();
//////////        double getPerimeter();
//////////    }
//////////    static class Circle implements Shape {
//////////        private double radius;
//////////
//////////        public Circle(double radius) {
//////////            this.radius = radius;
//////////        }
//////////
//////////        @Override
//////////        public double getArea() {
//////////            return Math.PI * radius * radius;
//////////        }
//////////
//////////        @Override
//////////        public double getPerimeter() {
//////////            return 2 * Math.PI * radius;
//////////        }
//////////    }
//////////    static class Rectangle implements Shape {
//////////        private double width;
//////////        private double height;
//////////
//////////        public Rectangle(double width, double height) {
//////////            this.width = width;
//////////            this.height = height;
//////////        }
//////////
//////////        @Override
//////////        public double getArea() {
//////////            return width * height;
//////////        }
//////////
//////////        @Override
//////////        public double getPerimeter() {
//////////            return 2 * (width + height);
//////////        }
//////////    }
//////////    public static void main(String[] args) {
//////////        Shape circle = new Circle(5);
//////////        Shape rectangle = new Rectangle(4, 6);
//////////
//////////        System.out.println("=== Circle ===");
//////////        System.out.println("Area: " + circle.getArea());
//////////        System.out.println("Perimeter: " + circle.getPerimeter());
//////////
//////////        System.out.println("\n=== Rectangle ===");
//////////        System.out.println("Area: " + rectangle.getArea());
//////////        System.out.println("Perimeter: " + rectangle.getPerimeter());
//////////    }
//////////}
//////////ss2
////////public class Main {
////////    public static void main(String[] args) {
////////        Vehicle car = new Car("Toyota");
////////        Vehicle bicycle = new Bicycle("Thống Nhất");
////////
////////        car.showInfo();
////////        bicycle.showInfo();
////////    }
////////}
////////ss3
//////public class Main {
//////    public static void main(String[] args) {
//////        Duck duck = new Duck("Vịt");
//////        Fish fish = new Fish("Cá");
//////
//////        System.out.println("=== Duck ===");
//////        duck.swim();
//////        duck.fly();
//////
//////        System.out.println("\n=== Fish ===");
//////        fish.swim();
//////    }
//////}
//////ss4
////public class Main {
////    public static void main(String[] args) {
////        RemoteControl smartLight = new RemoteControl() {
////            @Override
////            public void powerOn() {
////                System.out.println("Đèn đã bật");
////            }
////        };
////
////        // Gọi các phương thức
////        smartLight.powerOn();
////        smartLight.checkBattery();
////    }
////}
////
//////ss5
//public class Main {
//    public static void main(String[] args) {
//        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000);
//        Employee manager = new Manager("Trần Thị B", 12000, 3000);
//
//        System.out.println("=== Bảng lương công ty ===");
//        staff.showSalaryInfo();
//        manager.showSalaryInfo();
//    }
//}
//
//////ss6
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Headphone", 150));

        // Sắp xếp theo giá (Anonymous Class)
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
            // 📌 Ghi chú: Anonymous Class hữu ích khi cần thêm biến nội bộ,
            // hoặc override nhiều phương thức trong cùng lúc.
        });

        System.out.println("=== Sắp xếp theo giá (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        // Sắp xếp theo tên (Lambda Expression)
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\n=== Sắp xếp theo tên (Lambda Expression) ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
