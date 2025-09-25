public class day018 {
    public static void main(String[] args) {
        byte a = 127;
        short b = a;
        int c = b;
        long d = c;
        double e = c;
        float f = c;

        System.out.println("byte: " + a);
        System.out.println("byte ke short: " + b);
        System.out.println("short ke int: " + c);
        System.out.println("int ke long: " + d);
        System.out.println("long ke double: " + e);
        System.out.println("double ke float: " + f);

    }
}
