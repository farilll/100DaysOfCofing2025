import java.util.Scanner;

public class day044 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int nilai = x.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("B");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("C");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("D");
        } else if (nilai > 0 && nilai <= 49) {
            System.out.println("E");
        } else {
            System.out.println("maksud?");
        }
        x.close();
    }
}
