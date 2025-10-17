import java.util.Scanner;

public class day040 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("angka 1 : ");
        double a = x.nextInt();
        System.out.print("pilih (+,-,/,*,%): ");
        char aritmatika = x.next().charAt(0);
        System.out.print("angka 2 : ");
        int b = x.nextInt();

        if (aritmatika == '+') {
            double hasil = a + b;
            System.out.println(hasil);
        } else if (aritmatika == '-') {
            double hasil = a - b;
            System.out.println(hasil);

        } else if (aritmatika == '/') {
            double hasil = a / b;
            System.out.println(hasil);

        } else if (aritmatika == '*') {
            double hasil = a * b;
            System.out.println(hasil);

        } else if (aritmatika == '%') {
            double hasil = a % b;
            System.out.println(hasil);
        }
        x.close();
    }
}
