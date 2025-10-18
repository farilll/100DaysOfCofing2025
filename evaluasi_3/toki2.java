package evaluasi_3;

import java.util.Scanner;

public class toki2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();

        if(a % 2 == 0){
            System.out.println("Tidak");
        }else{
            System.out.println("Perlu");
        }
    }
}
