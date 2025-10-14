import java.util.Scanner;

public class day037 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int angka = x.nextInt();

        if (angka % 2 == 0) {
            System.out.printf("%s adalah bilangan genap", angka);
        } else {
            System.out.printf("%s adalah bilangan ganjil", angka);
        }
        x.close();
    }
}
