package evaluasi_1;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a =sc.nextInt();
        System.out.print("b: ");
        int b =sc.nextInt();
        System.out.print("c: ");
        int c =sc.nextInt();

        System.out.println("sebelum di tukar = a = "+ a + ", b = " + b + ", c = " + c);

        int temp = a; //16
        
        a = c; //76
        c = b;
        b = temp;//16
    
        System.out.println("setelah di tukar = a = "+ a + ", b = " + b + ", c = " + c);

        sc.close();
    }
}
