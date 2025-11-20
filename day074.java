import java.util.Scanner;

public class day074 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a;
        do {
            System.out.print("angka: ");
            a = x.nextInt();
        } while (a != 0);
        System.out.println("program selesai");
        x.close();
    }
}
