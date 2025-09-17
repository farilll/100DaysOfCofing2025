public class day010 {

    public static void main(String[] args) {

        /*
         * variable ANGKA tidak bisa diubah nilainya karena sudah di deklarasikan
         * sebagai final, dan huruf kapital sudah menjadi ciri khas dari sebuah constant
         */
        final int ANGKA = 17;
        int angka2 = 20;

        System.out.println("nilai angka = " + ANGKA);
        System.out.println("nilai angka2 = " + angka2);

        // variabel angka2 bisa diupdate kaena tidak di deklarasikan sebagai final
        angka2 = 11;
        System.out.println("nilai angka2 setelah diupdate = " + angka2);
    }
}