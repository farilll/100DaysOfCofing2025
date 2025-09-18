import java.util.Scanner;

public class day011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama anda: ");
        String nama = sc.nextLine();
        System.out.print("Angkatan: ");
        int angkatan = sc.nextInt();

        System.out.println("==============================");
        System.out.println("Welcome " + nama + " angkatan " + angkatan + "!");
    }
}