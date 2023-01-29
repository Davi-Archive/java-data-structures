package string;

public class StringCase {

    public static void main(String[] args) {
        stringCaseLower();
    }

    private static void stringCaseLower() {
        char[] a = {65, 66, 67, 68, 69, 70};
        int i = 0;
        for (; i < a.length; i++) {
            a[i] = (char) (a[i]+32);
            System.out.println(a[i]);
        }
    }
}
