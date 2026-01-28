import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_Bai5 {

    public static void main(String[] args) {

        // Giả lập "file log" (nhiều dòng). Nếu thầy cô bắt đọc file thật thì mình chỉnh sau.
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: NguyenVanA | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LinhTran   | Action: BORROW | BookID: BK99999",
                "2024-05-23 | User: HuyLe      | Action: BORROW | BookID: BK00001"
        };

        // Regex có Capturing Groups:
        // (1) date: yyyy-mm-dd
        // (2) user: chuỗi không có dấu |
        // (3) action: BORROW hoặc RETURN
        // (4) bookId: BK + số
        String regex = "^(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*User:\\s*([^|]+?)\\s*\\|\\s*Action:\\s*(BORROW|RETURN)\\s*\\|\\s*BookID:\\s*(BK\\d+)$";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        System.out.println("===== TÁCH THÔNG TIN LOG =====");

        for (int i = 0; i < logs.length; i++) {
            String line = logs[i];

            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                // Lưu vào biến riêng
                String date = matcher.group(1);
                String user = matcher.group(2).trim();
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                // In kết quả (giống mẫu)
                System.out.println("\nDòng " + (i + 1) + ":");
                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);

                // Thống kê BORROW / RETURN
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            } else {
                System.out.println("\nDòng " + (i + 1) + " sai định dạng: " + line);
            }
        }

        System.out.println("\n===== THỐNG KÊ =====");
        System.out.println("Số hành động BORROW: " + borrowCount);
        System.out.println("Số hành động RETURN: " + returnCount);
    }
}
