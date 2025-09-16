public class day009 {
    public static void main(String[] args) {

        // deklarasi variable
        String nama, alamat;

        // initialisasi variable
        nama = "John Doe";
        alamat = "Uk";

        System.out.println("=== sebelum diupdate ===");
        System.out.println("Nama saya " + nama + ", saya tinggal di " + alamat);

        // update variable
        alamat = "Indonesia";
        System.out.println("=== sesudah diupdate ===");
        System.out.println("Nama saya " + nama + ", saya tinggal di " + alamat);
    }
}
