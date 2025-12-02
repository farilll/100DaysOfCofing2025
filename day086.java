public class day086 {
    public static void main(String[] args) {
        int[] arr = {22,2,33,44};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
