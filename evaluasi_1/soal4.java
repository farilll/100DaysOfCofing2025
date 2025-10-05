package evaluasi_1;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int p = x.nextInt();
        int l = x.nextInt();

        x.close();
        int keramik = 2 * 2;

        int hasil = p * l /keramik;

        System.out.println(hasil);
    }
}
