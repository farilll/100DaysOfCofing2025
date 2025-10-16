import java.util.Scanner;

public class day039 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("===Menu===");
        System.out.println("1.Ayam geprek\tRp.13000\n2.Mie ayam\tRp.12000\n3.Nasi campur\tRp.10000");
        System.out.print("pilih menu: ");
        int pilih = x.nextInt();
        System.out.print("jumlah: ");
        int jumlah = x.nextInt();
        if (pilih == 1) {
            int harga = 13000;
            int total = jumlah * harga;
            System.out.printf("total pembayaran: %d ", total);
        } else if (pilih == 2) {
            int harga = 12000;
            int total = jumlah * harga;
            System.out.printf("total pembayaran: %d ", total);
        } else if (pilih == 3) {
            int harga = 10000;
            int total = jumlah * harga;
            System.out.printf("total pembayaran: %d ", total);

        }
        x.close();
    }
}
