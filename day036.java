public class day036 {
    public static void main(String[] args) {
        char gender = 'l';
        int umur = 19;

        if (gender == 'l') {
            if (umur >= 18) {
                System.out.printf("hidup aman bg?");
            } else if (umur < 18) {
                System.out.printf("mikir kids");
            }
        } else {
            System.out.printf("dasar women");
        }
    }
}
