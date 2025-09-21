import java.util.Scanner;

public class day015 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        System.out.print("angka 1 : ");
        int a = x.nextInt();

        System.out.print("angka 2 : ");
        int b = x.nextInt();

        int c = a + b;
        int d = a - b;

        System.out.println("hasil tambah : " + c);
        System.out.println("hasil kurang : " + d);

        x.close();
    }
}
