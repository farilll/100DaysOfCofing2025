public class day075 {
    public static void main(String[] args) {
        String a = "Yooo";

        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        String b = a.toUpperCase();
        String c = b.toLowerCase();

        System.out.println(b);
        System.out.println(c);
    }
}
