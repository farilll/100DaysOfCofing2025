public class day087 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55 };
        int dapat = 2;
        boolean ditemukan = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dapat) {
                ditemukan = true;
                System.out.println(i);
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan");
        }
    }
}
