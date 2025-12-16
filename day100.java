import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String cantik = x.nextLine();

        int tahap = 0;
        boolean isCantik = false;

        for (int i = 0; i < cantik.length(); i++) {
            char ch = cantik.charAt(i);

            if (tahap == 0 && ch == 'I') {
                tahap = 1;
            } else if (tahap == 1 && ch == 'S') {
                tahap = 2;
            } else if (tahap == 2 && ch == 'C') {
                isCantik = true;
                break;
            }
        }

        if (isCantik) {
            System.out.println("cantik");
        } else {
            System.out.println("tidak cantik");
        }

        x.close();
    }
}
