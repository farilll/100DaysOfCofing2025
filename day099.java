import java.util.Scanner;

public class day099 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();

        System.out.print("Bilangan prima dari 1 sampai " + n + ": ");

        for (int angka = 2; angka <= n; angka++) {
            boolean prima = true;

            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
            }
        }

        x.close();
    }
}
