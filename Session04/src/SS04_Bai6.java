import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_Bai6 {

    private static final int MAX_LEN = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Blacklist (có thể thêm/bớt tùy đề bài)
        String[] blacklist = {
                "tệ",
                "ngu",
                "ngốc",
                "ngu ngốc",
                "không đáng",
                "vớ vẩn"
        };

        System.out.print("Nhập review: ");
        String review = sc.nextLine();

        // Ví dụ nếu bạn muốn test nhanh (nhập rỗng thì dùng mẫu)
        if (review.trim().isEmpty()) {
            review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. "
                    + "Nhưng phần đầu vẫn có vài điểm hay. (đoạn thêm để dài hơn nếu cần) "
                    + "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        }

        // 2) Dùng Regex tìm tất cả từ trong blacklist (không phân biệt hoa thường)
        String filtered = censorByBlacklist(review, blacklist);

        // 4) Nếu quá dài > 200 ký tự: cắt và thêm "..." nhưng không cắt ngang giữa 1 từ
        String finalText = shortenWithoutCuttingWord(filtered, MAX_LEN);

        System.out.println("\n--- Review sau khi xử lý ---");
        System.out.println(finalText);

        sc.close();
    }

    // ========== YÊU CẦU 2 + 3 ==========
    // Regex + Capturing/Matcher để thay thế theo đúng độ dài match
    private static String censorByBlacklist(String text, String[] blacklist) {
        // Tạo regex dạng: (tệ|ngu ngốc|không đáng|...)
        // Pattern.quote để tránh lỗi nếu blacklist có ký tự đặc biệt
        String patternText = buildBlacklistPattern(blacklist);

        // (?i) = ignore case, \\b để giới hạn theo "từ" (cơ bản)
        // Lưu ý: với tiếng Việt, \\b vẫn dùng được ở mức bài tập cơ bản.
        String regex = "(?i)\\b(" + patternText + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String found = matcher.group(1);

            // tạo số sao theo độ dài (không tính khoảng trắng)
            String stars = makeStars(found);

            // append phần trước + thay thế
            matcher.appendReplacement(result, stars);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    private static String buildBlacklistPattern(String[] blacklist) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < blacklist.length; i++) {
            if (i > 0) sb.append("|");
            sb.append(Pattern.quote(blacklist[i].trim()));
        }
        return sb.toString();
    }

    private static String makeStars(String match) {
        int count = 0;
        for (int i = 0; i < match.length(); i++) {
            char c = match.charAt(i);
            if (c != ' ') count++; // bỏ space trong cụm từ như "ngu ngốc"
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("*");
        return sb.toString();
    }

    // ========== YÊU CẦU 4 ==========
    // Cắt <= maxLen, không cắt giữa 1 từ, dùng substring + StringBuilder, thêm "..."
    private static String shortenWithoutCuttingWord(String text, int maxLen) {
        if (text.length() <= maxLen) return text;

        int cut = maxLen;

        // Nếu ký tự tại vị trí cut không phải khoảng trắng => lùi về dấu space gần nhất
        // để không cắt giữa từ
        while (cut > 0 && text.charAt(cut - 1) != ' ' && text.charAt(cut - 1) != '\n' && text.charAt(cut - 1) != '\t') {
            cut--;
        }

        // Nếu không tìm được khoảng trắng (1 từ quá dài) thì cắt thẳng tại maxLen
        if (cut == 0) cut = maxLen;

        String part = text.substring(0, cut).trim();

        StringBuilder sb = new StringBuilder();
        sb.append(part);
        sb.append("...");

        return sb.toString();
    }
}
