import java.util.Scanner;

public class day043 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("angka: ");
        int angka = x.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah angka kelipatan 3 dan 5");

        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah angka kelipatan 3");

        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah angka kelipatan 5");

        } else {
            System.out.println(angka + " bukan angka kelipatan 3 maupun 5");
        }
        x.close();
    }
}
