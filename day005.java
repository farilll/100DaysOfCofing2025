public class day005 {

    public static void main(String[] args) {
        // byte adalah tipe data bilangan bulat dengan batas tampung -128 sampai 127
        byte a = 10;

        // batas tampung dari short adalah -32.768 sampai 32.767
        short b = 20;

        // batas tampung dari int adalah -2.147.483.648 sampai 2.147.483.647
        int c = 30;

        // batas tampung dari long adalah -9.223.372.036.854.775.808 sampai. di belakangnya tidak ada L maka akan dianggap int
        long d = 40l;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}