public class day064 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;
        }
        System.out.println(hasil);
    }
}