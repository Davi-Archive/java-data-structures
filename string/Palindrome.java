package string;

public class Palindrome {
    public static void main(String[] args) {
        palindrome();
    }

    private static void palindrome() {
        char[] a = "nitin".toCharArray();
        char[] b = new char[a.length];
        int j = 0;
        boolean isPali = true;

        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] != a[i]) {
                isPali = false;
                break;
            }
        }
        if (!isPali) System.out.println("NOT PALIDROME");
        else System.out.println("PALIDROME");
    }
}
