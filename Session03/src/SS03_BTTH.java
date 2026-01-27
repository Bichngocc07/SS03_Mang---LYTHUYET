import java.util.Scanner;
public class SS03_BTTH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int[] ids = new int [100];
            String[] titles= new String[100];
            int[] quantities = new int[100];
            int current = 2;
            ids[0] = 1;
            titles[0] = "Lão Hạc";
            quantities[0] = 10;
            ids[1] = 2;
            titles[1] = "Chiếc lược ngà";
            quantities[1] = 9;
            do {
                System.out.println("""
                        1.
                        2.
                        3.
                        4.
                        5.
                        6.
                        7.
                        """

                );
            }
    }
}