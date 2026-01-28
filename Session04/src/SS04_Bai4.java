public class SS04_Bai4 {
    public static void main(String[] args) {

        
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

       
        long startSB = System.currentTimeMillis();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Ngày tạo: 24/01/2026\n"); 
        for (int i = 0; i < transactions.length; i++) {
            report.append("Giao dịch: ").append(transactions[i]).append("\n");
        }

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;

        
        System.out.println(report.toString());

       
        int loop = 50000;

        
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append("Giao dịch: ").append(transactions[i % transactions.length]).append("\n");
        }
        long end1 = System.currentTimeMillis();
        long timeBuilder = end1 - start1;

        
        long start2 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < loop; i++) {
            s = s + "Giao dịch: " + transactions[i % transactions.length] + "\n";
        }
        long end2 = System.currentTimeMillis();
        long timeString = end2 - start2;

        
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeBuilder + " ms");
        System.out.println("Số thời gian thực thi đối với String (+): " + timeString + " ms");

       
        System.out.println("Thời gian tạo báo cáo (StringBuilder): " + timeSB + " ms");
    }
}

