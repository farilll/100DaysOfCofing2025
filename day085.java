public class day085 {
    public static void main(String[] args) {
        double[] arr = { 1, 2, 3, 4 };
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
