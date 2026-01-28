import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SS04_Bai6 {

    private static final int MAX_LEN = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
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

     
        if (review.trim().isEmpty()) {
            review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. "
                    + "Nhưng phần đầu vẫn có vài điểm hay. (đoạn thêm để dài hơn nếu cần) "
                    + "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        }

     
        String filtered = censorByBlacklist(review, blacklist);

      
        String finalText = shortenWithoutCuttingWord(filtered, MAX_LEN);

        System.out.println("\n--- Review sau khi xử lý ---");
        System.out.println(finalText);

        sc.close();
    }

   
    private static String censorByBlacklist(String text, String[] blacklist) {
     
        String patternText = buildBlacklistPattern(blacklist);

        String regex = "(?i)\\b(" + patternText + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String found = matcher.group(1);

          
            String stars = makeStars(found);

          
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
            if (c != ' ') count++; 
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("*");
        return sb.toString();
    }

   
    private static String shortenWithoutCuttingWord(String text, int maxLen) {
        if (text.length() <= maxLen) return text;

        int cut = maxLen;

       
        while (cut > 0 && text.charAt(cut - 1) != ' ' && text.charAt(cut - 1) != '\n' && text.charAt(cut - 1) != '\t') {
            cut--;
        }

     
        if (cut == 0) cut = maxLen;

        String part = text.substring(0, cut).trim();

        StringBuilder sb = new StringBuilder();
        sb.append(part);
        sb.append("...");

        return sb.toString();
    }
}

