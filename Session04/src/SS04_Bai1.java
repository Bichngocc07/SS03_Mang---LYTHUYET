import java.util.Scanner;

public class SS04_Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Nhập tên sách, tác giả, thể loại
        System.out.print("Nhập tên sách: ");
        String rawTitle = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String rawAuthor = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String rawCategory = sc.nextLine();

        // 2) Loại bỏ khoảng trắng thừa (2 đầu + giữa các từ)
        String cleanTitle = cleanSpaces(rawTitle);
        String cleanAuthor = cleanSpaces(rawAuthor);
        String cleanCategory = cleanSpaces(rawCategory); // (nếu bạn muốn dùng)

        // 3) Định dạng lại:
        // - Tên sách viết hoa toàn bộ
        // - Tên tác giả viết hoa chữ cái đầu mỗi từ
        String formattedTitle = cleanTitle.toUpperCase();
        String formattedAuthor = toTitleCase(cleanAuthor);

        // 4) Xuất ra chuỗi tổng hợp: [TÊN SÁCH] - Tác giả: [Tên Tác Giả]
        String result = "[" + formattedTitle + "] - Tác giả: " + formattedAuthor;

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Thể loại (đã làm sạch): " + cleanCategory);
        System.out.println(result);

        sc.close();
    }

    // Bỏ khoảng trắng thừa: trim + gộp nhiều space thành 1 space
    private static String cleanSpaces(String s) {
        if (s == null) return "";
        return s.trim().replaceAll("\\s+", " ");
    }

    // Viết hoa chữ cái đầu mỗi từ, phần còn lại viết thường
    private static String toTitleCase(String s) {
        if (s == null) return "";
        s = s.trim();
        if (s.isEmpty()) return "";

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            String lower = w.toLowerCase();
            // an toàn nếu có từ rỗng
            if (lower.isEmpty()) continue;

            String first = lower.substring(0, 1).toUpperCase();
            String rest = (lower.length() > 1) ? lower.substring(1) : "";

            sb.append(first).append(rest).append(" ");
        }

        return sb.toString().trim();
    }
}
