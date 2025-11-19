import java.util.Scanner;

public class day073 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int total = 0;
        while (true) {
            System.out.print("masukkan angka: ");
            int input = x.nextInt();

            if (input < 0) {
                x.close();
                return;
            } else {
                total += input;
            }
            System.out.println("hasil: " + total);
        }
    }
}
