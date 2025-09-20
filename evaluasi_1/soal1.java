package evaluasi_1;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        final short tahunSekarang = sc.nextShort();
        short tahunDepan = sc.nextShort();
        int tahunLalu = sc.nextInt();

        System.out.printf("Saat ini tahun %d \n", tahunSekarang);
        System.out.println("Jadi tahun kemarin adalah tahun " + tahunLalu);
        System.out.println("Tahun depan berarti " + tahunDepan);
        System.out.print(tahunLalu + ", ");
        System.out.print(tahunSekarang + ", ");
        System.out.print(tahunDepan);

        sc.close();
    }
}