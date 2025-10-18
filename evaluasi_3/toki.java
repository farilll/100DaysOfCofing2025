package evaluasi_3;

import java.util.Scanner;

public class toki {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        int hasil = a + b + c;
        if (a >= 50 && b >= 50 && c >= 50 && hasil > 200) {
            System.out.println("Lolos");
        } else {
            System.out.println("Tidak Lolos");
        }
    }
}
