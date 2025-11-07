import java.util.Scanner;

public class day061 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("masukkan nilai M: ");
        int m = x.nextInt();

        System.out.print("masukkan nilai N: ");
        int n = x.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
        x.close();
    }
}
