import java.util.Scanner;

public class day079 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String username;
        String password;

        do {
            System.out.println("===HALAMAN LOGIN===");
            System.out.print("Username: ");
            username = x.nextLine();
            System.out.print("Password: ");
            password = x.nextLine();
        } while (!username.equals("faril") || !password.equals("1234"));
        System.out.println("welcome!");
        x.close();
    }
}
