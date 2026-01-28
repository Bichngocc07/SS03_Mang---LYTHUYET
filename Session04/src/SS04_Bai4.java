public class SS04_Bai4 {
    public static void main(String[] args) {

        // 1) Tạo danh sách giao dịch (Mã sách - Ngày mượn)
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        // 2) Tạo báo cáo bằng StringBuilder (mỗi giao dịch 1 dòng) + 3) Thêm ngày tạo ở đầu báo cáo
        long startSB = System.currentTimeMillis();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Ngày tạo: 24/01/2026\n"); // theo ví dụ ảnh
        for (int i = 0; i < transactions.length; i++) {
            report.append("Giao dịch: ").append(transactions[i]).append("\n");
        }

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;

        // In báo cáo
        System.out.println(report.toString());

        // 4) So sánh thời gian: dùng String (+) vs StringBuilder
        // (Cho chạy lặp nhiều lần để thấy chênh lệch rõ hơn)
        int loop = 50000;

        // ---- đo thời gian với StringBuilder ----
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append("Giao dịch: ").append(transactions[i % transactions.length]).append("\n");
        }
        long end1 = System.currentTimeMillis();
        long timeBuilder = end1 - start1;

        // ---- đo thời gian với String (+) ----
        long start2 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < loop; i++) {
            s = s + "Giao dịch: " + transactions[i % transactions.length] + "\n";
        }
        long end2 = System.currentTimeMillis();
        long timeString = end2 - start2;

        // In thời gian
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeBuilder + " ms");
        System.out.println("Số thời gian thực thi đối với String (+): " + timeString + " ms");

        // In thêm thời gian tạo báo cáo ban đầu (nhỏ)
        System.out.println("Thời gian tạo báo cáo (StringBuilder): " + timeSB + " ms");
    }
}
