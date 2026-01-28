import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_BTTH {

    // Theo đề bài: không lớn hơn năm hiện tại (2026)
    private static final int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== YÊU CẦU 1: Nhập + Validate bằng Regex (Pattern + Matcher) + do...while =====
        String bookId = inputWithRegex(
                sc,
                "Nhập Mã sách (LIB-xxxx-S): ",
                "^LIB-\\d{4}-S$",
                "Sai định dạng! Ví dụ đúng: LIB-2024-S"
        );

        String isbn10 = inputWithRegex(
                sc,
                "Nhập ISBN-10 (10 chữ số): ",
                "^\\d{10}$",
                "Sai định dạng! ISBN-10 phải đúng 10 chữ số (VD: 0123456789)"
        );

        int publishYear = inputYear(sc);

        // Nhập tên sách, tác giả (có thể thừa space, lộn xộn hoa thường)
        System.out.print("Nhập Tên sách: ");
        String rawTitle = sc.nextLine();

        System.out.print("Nhập Tác giả: ");
        String rawAuthor = sc.nextLine();

        // ===== YÊU CẦU 2: Chuẩn hoá dữ liệu bằng StringBuilder =====
        String title = normalizeTitleCase(rawTitle);
        String author = normalizeTitleCase(rawAuthor);

        System.out.println("\nTên/Tác giả sau chuẩn hoá:");
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);

        // ===== YÊU CẦU 3: Tạo chuỗi biên mục bằng StringBuilder + \n =====
        String report = buildCatalogReport(bookId, isbn10, publishYear, title, author);
        System.out.println("\n" + report);

        // Giải thích ngắn gọn theo yêu cầu
        System.out.println("Ghi chú: Dùng StringBuilder tối ưu hơn toán tử '+' khi nối nhiều lần vì");
        System.out.println("- '+' tạo ra nhiều String trung gian (String bất biến), tốn bộ nhớ/GC.");
        System.out.println("- StringBuilder dùng 1 buffer, append liên tục, giảm đối tượng rác.");

        sc.close();
    }

    // --- YÊU CẦU 1: Hàm nhập và kiểm tra bằng Pattern + Matcher, sai thì bắt nhập lại ---
    private static String inputWithRegex(Scanner sc, String prompt, String regex, String errorMsg) {
        Pattern pattern = Pattern.compile(regex);
        String value;

        do {
            System.out.print(prompt);
            value = sc.nextLine().trim(); // trim cho sạch đầu/cuối
            Matcher matcher = pattern.matcher(value);
            if (matcher.matches()) {
                return value;
            }
            System.out.println(errorMsg);
        } while (true);
    }

    // Năm xuất bản: 4 chữ số và <= CURRENT_YEAR
    private static int inputYear(Scanner sc) {
        String yearStr;
        do {
            System.out.print("Nhập Năm xuất bản (4 chữ số, <= " + CURRENT_YEAR + "): ");
            yearStr = sc.nextLine().trim();

            // Regex 4 chữ số
            Pattern p = Pattern.compile("^\\d{4}$");
            Matcher m = p.matcher(yearStr);

            if (!m.matches()) {
                System.out.println("Sai định dạng! Năm phải là 4 chữ số.");
                continue;
            }

            int year = Integer.parseInt(yearStr);
            if (year > CURRENT_YEAR) {
                System.out.println("Sai! Năm không được lớn hơn " + CURRENT_YEAR + ".");
                continue;
            }

            return year;
        } while (true);
    }

    // --- YÊU CẦU 2: Chuẩn hoá: trim -> split("\\s+") -> toLowerCase -> viết hoa chữ cái đầu ---
    private static String normalizeTitleCase(String input) {
        if (input == null) return "";

        String trimmed = input.trim();
        if (trimmed.isEmpty()) return "";

        String[] words = trimmed.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            String lower = w.toLowerCase();

            // an toàn nếu từ rỗng
            if (lower.isEmpty()) continue;

            // Viết hoa chữ đầu, phần còn lại giữ thường
            String first = lower.substring(0, 1).toUpperCase();
            String rest = (lower.length() > 1) ? lower.substring(1) : "";

            sb.append(first).append(rest).append(" ");
        }

        // bỏ dấu cách cuối
        return sb.toString().trim();
    }

    // --- YÊU CẦU 3: Build report bằng StringBuilder + \n ---
    private static String buildCatalogReport(String id, String isbn10, int year, String title, String author) {
        StringBuilder sb = new StringBuilder();

        sb.append("----- KẾT QUẢ BIÊN MỤC -----\n");
        sb.append("Mã sách chuẩn: ").append(id).append("\n");
        sb.append("ISBN-10: ").append(isbn10).append("\n");
        sb.append("Tên sách: ").append(title).append("\n");
        sb.append("Tác giả: ").append(author).append("\n");
        sb.append("Năm XB: ").append(year).append("\n");

        // Chuỗi trích dẫn theo cấu trúc: [Mã Sách] - [Tên Sách] - [Tác Giả] (Năm XB)
        sb.append("Trích dẫn: [")
                .append(id)
                .append("] - ")
                .append(title)
                .append(" - ")
                .append(author)
                .append(" (")
                .append(year)
                .append(")\n");

        return sb.toString();
    }
}
