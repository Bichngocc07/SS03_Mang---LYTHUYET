import java.util.Scanner;

public class SS04_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mô tả sách: ");
        String description = sc.nextLine();

        String keyword = "Kệ:";

        if (!description.contains(keyword)) {
            System.out.println("Không tìm thấy từ khóa \"" + keyword + "\" trong mô tả.");
            System.out.println("Mô tả giữ nguyên: " + description);
            sc.close();
            return;
        }

        
        int keyIndex = description.indexOf(keyword);

       
        int start = keyIndex + keyword.length();

        
        while (start < description.length() && description.charAt(start) == ' ') {
            start++;
        }

        
        int commaIndex = description.indexOf(",", start);
        int newlineIndex = description.indexOf("\n", start);

        int end;
        if (commaIndex == -1 && newlineIndex == -1) {
            end = description.length();
        } else if (commaIndex == -1) {
            end = newlineIndex;
        } else if (newlineIndex == -1) {
            end = commaIndex;
        } else {
            end = Math.min(commaIndex, newlineIndex);
        }

        
        String locationCode = description.substring(start, end).trim();

        System.out.println("Vị trí tìm thấy: " + locationCode);

       
        String newDescription =
                description.substring(0, keyIndex)
                        + "Vị trí lưu trữ:"
                        + description.substring(keyIndex + keyword.length());

        System.out.println("Mô tả mới: " + newDescription);

        sc.close();
    }
}

