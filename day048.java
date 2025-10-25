import java.util.Scanner;

public class day048 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("angka 1: ");
        int angka1 = x.nextInt();
        x.nextLine();
        System.out.print("pilih (+, -, /, *): ");
        String aritmatika = x.nextLine();
        System.out.print("angka 2: ");
        int angka2 = x.nextInt();

        int hasil = 0;
        switch (aritmatika) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;

            default:
                System.out.println("tidak valid");
                break;
        }
        System.out.println("hasil : " + hasil);
        x.close();
    }
}
