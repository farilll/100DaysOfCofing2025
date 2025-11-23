public class day077 {

    public static void main(String[] args) {
        String a = "hello world";
        String b = "   spasi   ";
        String potong = b.trim();
        System.out.println(a.substring(6));
        System.out.println(a.replace("hello", "halo"));
        System.out.println("=====");
        System.out.print("sebelum menghapus: ");
        System.out.println(b);
        System.out.print("sesudah dihapus: ");
        System.out.println(potong);
    }
}