public class day078 {
    public static void main(String[] args) {
        String s1 = " hello World ";
        String s2 = "Yooo";

        System.out.println("length s1 : " + s1.length()); // termasuk spasi

        System.out.println("charAt(1) s2 : " + s2.charAt(1)); // 'o' dari "Yooo"

        System.out.println("substring(1) of s2: " + s2.substring(1));
        System.out.println("substring(1,3) of s2: " + s2.substring(1, 3));

        String numbers = "a1b2c3";
        System.out.println("replaceAll non-digit -> '' : " + numbers.replaceAll("\\D", ""));

        System.out.println("indexOf('o') in s2 : " + s2.indexOf('o'));
        System.out.println("lastIndexOf('o') in s2 : " + s2.lastIndexOf('o'));

        System.out.println("concat s2 + \"!\" : " + s2.concat("!"));

    }
}