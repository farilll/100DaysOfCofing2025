public class day004 {
    public static void main(String[] args) {
        String nama = "faril";
        String nim = "D0223015";
        int umur = 99;

        // \n berfungsi untuk membuat baris baru
        System.out.print("welcome:\n");

        // \t berfungsi untuk membuat tab
        System.out.println("nama\t:" + nama);
        System.out.println("nim \t:" + nim);

        // \b berfungsi untuk menghapus karakter sebelumnya
        System.out.printf("umur\t\b : %d tahun", umur);

        // \r berfungsi untuk menimpa karakter sebelumnya. contoh H ditimpa W, e ditimpa o, dst
        System.out.println("\nHello\rWorld");

        // \" berfungsi untuk menampilkan tanda petik ganda
        System.out.println("dia berkata, \"hai dunia!\"");

        // \\ berfungsi untuk menampilkan alamat file path. karena kalau \ saja, maka akan dianggap sebagai karakter escape.
        System.out.println("C:\\Users\\faril");

        // \\uXXX angka hexadesimal (basis 16) yang mewakili kode Unicode karakter tertentu
        char omega = '\u03A9';
        System.out.println("omega: "+omega);

    }
}
