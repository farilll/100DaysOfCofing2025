import java.util.Scanner;

public class day046 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("===MataKUliah===");
        System.out.println("1.DDP\n2.PBO\n3.FWB");
        System.out.print("pilih: ");
        int pilih = x.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("anda memilih DDP");
                break;
            case 2:
                System.out.println("anda memilih PBO");
                break;
            case 3:
                System.out.println("anda memilih FWB");
                break;

            default:
                System.out.println("tidak ada dalam daftar");
                break;
        }
        x.close();
    }

}
