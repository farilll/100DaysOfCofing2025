public class day059 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 1; j <= n; j += 2) {
            System.out.print(j + " ");
        }
    }
}
