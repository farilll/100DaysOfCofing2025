public class day063 {
    public static void main(String[] args) {
        int n = 1;
        int total = 1;

        while (n <= 10) {
            total *= n;
            n++;
        }
        System.out.println(total);
    }
}
