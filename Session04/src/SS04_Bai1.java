import java.util.Scanner;

public class SS04_Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Nhập tên sách: ");
        String rawTitle = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String rawAuthor = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String rawCategory = sc.nextLine();

       
        String cleanTitle = cleanSpaces(rawTitle);
        String cleanAuthor = cleanSpaces(rawAuthor);
        String cleanCategory = cleanSpaces(rawCategory); 

     
        String formattedTitle = cleanTitle.toUpperCase();
        String formattedAuthor = toTitleCase(cleanAuthor);

       
        String result = "[" + formattedTitle + "] - Tác giả: " + formattedAuthor;

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Thể loại (đã làm sạch): " + cleanCategory);
        System.out.println(result);

        sc.close();
    }

   
    private static String cleanSpaces(String s) {
        if (s == null) return "";
        return s.trim().replaceAll("\\s+", " ");
    }

    
    private static String toTitleCase(String s) {
        if (s == null) return "";
        s = s.trim();
        if (s.isEmpty()) return "";

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            String lower = w.toLowerCase();
            
            if (lower.isEmpty()) continue;

            String first = lower.substring(0, 1).toUpperCase();
            String rest = (lower.length() > 1) ? lower.substring(1) : "";

            sb.append(first).append(rest).append(" ");
        }

        return sb.toString().trim();
    }
}

