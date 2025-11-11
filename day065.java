public class day065 {
    public static void main(String[] args) {
        int f = 4;

        int hasil = 1;
        for (int i = f; i >= 1; i--) {
            hasil *= i;
        }
        System.out.println(hasil);
    }
}
