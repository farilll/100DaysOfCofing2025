import java.util.Scanner;

public class day060 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();

        for (int i = a; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = a; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        x.close();
    }
}
