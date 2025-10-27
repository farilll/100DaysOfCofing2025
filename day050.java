import java.util.Scanner;

public class day050 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int angka = x.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println(hasil);

        x.close();
    }
}