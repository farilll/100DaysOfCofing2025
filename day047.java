import java.util.Scanner;

public class day047 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("masukkan (1-7): ");
        int angka = x.nextInt();

        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;

            default:
                hari = "tidak ada dalam kalender";
                break;
        }
        System.out.printf("hari %s", hari);
        x.close();
    }
}
