public class day098 {
    public static void main(String[] args) {
        int n = 5;

        int n1 = 0, n2 = 1, nextTerm;

        System.out.print("Deret Fibonacci: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
