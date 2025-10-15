import java.util.Scanner;

public class day038 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int angka = x.nextInt();

        if (angka > 0) {
            System.out.println("positif");
        } else if (angka == 0) {
            System.out.println("netral");
        } else {
            System.out.println("negatif");
        }
        x.close();
    }
}
