import java.util.Scanner;

public class day044 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int nilai = x.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else if (nilai >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        x.close();
    }
}
