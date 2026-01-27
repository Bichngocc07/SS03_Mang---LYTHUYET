import java.util.Scanner;

public class SS03_BTTH {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] ids = new int[100];
String[] titles = new String[100];
int[] quantities = new int[100];

int current = 2;
ids[0] = 1;
titles[0] = "Lão Hạc";
quantities[0] = 10;

ids[1] = 2;
titles[1] = "Chiếc lược ngà";
quantities[1] = 9;

int choice;

do {
System.out.println("""
===== MENU =====
1. Xem danh sách
2. Thêm sách mới
3. Thoát
""");
System.out.print("Chọn: ");
choice = Integer.parseInt(sc.nextLine());

if (choice == 1) {
if (current == 0) {
System.out.println("Danh sách rỗng.");
} else {
System.out.printf("%-10s | %-30s | %-10s%n", "Mã", "Tên", "Số lượng");
System.out.println("-----------------------------------------------------------");
for (int i = 0; i < current; i++) {
System.out.printf("%-10d | %-30s | %-10d%n", ids[i], titles[i], quantities[i]);
}
}

} else if (choice == 2) {
                
if (current == 100) {
System.out.println("Mảng đã đầy, không thể thêm.");
} else {
int addCount;

        
do {
System.out.print("Nhập số lượng muốn thêm: ");
addCount = Integer.parseInt(sc.nextLine());
if (addCount <= 0) System.out.println("Số lượng phải > 0, nhập lại!");
} while (addCount <= 0);

            
for (int k = 0; k < addCount; k++) {
if (current == 100) {
System.out.println("Mảng đã đầy, dừng thêm.");
break;
}

int id;
String title;
int qty;

while (true) {
System.out.print("Nhập mã sách (duy nhất): ");
id = Integer.parseInt(sc.nextLine());

boolean trung = false;
for (int i = 0; i < current; i++) {
if (ids[i] == id) {
trung = true;
break;
}
}

if (trung) System.out.println("Mã sách trùng! Nhập lại.");
else break;
}

                
while (true) {
System.out.print("Nhập tên sách: ");
title = sc.nextLine().trim();
if (title.isEmpty()) System.out.println("Tên không được trống! Nhập lại.");
else break;
}

while (true) {
System.out.print("Nhập số lượng (>=0): ");
qty = Integer.parseInt(sc.nextLine());
if (qty < 0) System.out.println("Số lượng phải >= 0! Nhập lại.");
else break;
}
                    
ids[current] = id;
titles[current] = title;
quantities[current] = qty;
               
current++;

System.out.println("Đã thêm 1 sách.");
}
}

} else if (choice == 3) {
System.out.println("Thoát chương trình.");

} else {
System.out.println("Chọn sai! Chỉ chọn 1-3.");
}

} while (choice != 3);
}
}
