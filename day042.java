import java.util.Scanner;

public class day042 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("masukkan gaji : ");
        double gaji = x.nextDouble();
        double pajak = 0.15;

        double potogan = gaji * pajak;
        double gajiBersih = gaji - potogan;

        System.out.printf("gaji sebelum dipotong 15%% : %.2f\n", gaji);
        System.out.printf("gaji setelah dipotong 15%% : %.2f\n", gajiBersih);

        x.close();
    }
}
