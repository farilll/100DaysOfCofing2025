import java.util.Scanner;

public class day021 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        x.close();

        System.out.println("================");
        System.out.println("sebelum ditukar:");
        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("setelah ditukar:");
        System.out.println(a + " " + b);
    }
}