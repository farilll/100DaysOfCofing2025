import java.util.Scanner;

public class day012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("***********BIODATA************");
        System.out.println("==============================");

        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("Alamat : ");
        String alamat = sc.nextLine();

        System.out.print("Angkatan : ");
        int ang = sc.nextInt();

        System.out.print("Jenis Kelamin : ");
        char jk = sc.next().charAt(0);

        System.out.print("Tinggi Badan : ");
        float tb = sc.nextFloat();

        System.out.print("Berat badan : ");
        double bb = sc.nextDouble();

        System.out.print("Umur : ");
        int umur = sc.nextInt();

        System.out.println("==============================");
        System.out.println("Biodata anda adalah sebagai berikut:");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Angkatan : " + ang);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Tinggi Badan : " + tb + " cm");
        System.out.println("Berat Badan : " + bb + " kg");
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("==============================");

        sc.close();

    }
}
