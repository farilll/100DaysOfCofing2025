import java.util.Scanner;

public class day097 {
    static int persegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int hasil = x.nextInt();
        int luas = persegi(hasil);

        System.out.println(luas);

    }
}
