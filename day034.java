public class day034 {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 2;

        // aritmatika
        int hasilaritmatika = (a * b) / c % 2 + 2 - 1; // 1

        System.out.printf("aritmatika: %s", hasilaritmatika);

        // perbandingan
        boolean lebihBesar = hasilaritmatika > 2; // false
        boolean lebihKecil = hasilaritmatika < 2; // true
        boolean samaDengan = hasilaritmatika == 2; // false
        boolean kebalikan = hasilaritmatika != 2; // true

        System.out.printf("\nlebih besar : %s", lebihBesar);
        System.out.printf("\nlebih kecil : %s", lebihKecil);
        System.out.printf("\nsama dengan : %s", samaDengan);
        System.out.printf("\nkebalikan : %s", kebalikan);

        // gerbang logika
        boolean gerbangLogika = (lebihBesar && lebihKecil) || (samaDengan || !kebalikan); // false or false = false

        System.out.printf("\ngerbang logika : %s", gerbangLogika);

        // penugasan
        a += 2;
        b -= 2;

        System.out.printf("\nupdate nilai a : %s", a);
        System.out.printf("\nupdate nilai b : %s", b);

    }
}
