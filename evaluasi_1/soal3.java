package evaluasi_1;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("merah: ");
        int merah = sc.nextInt();
        System.out.print("hijau: ");
        int hijau = sc.nextInt();
        System.out.print("biru: ");
        int biru = sc.nextInt();

        System.out.printf("%d ->", merah);
        
        hijau = merah;
        System.out.print(" " + hijau + " ->");

        biru = hijau;
        System.out.print(" " + biru);

        sc.close();
    }
}
