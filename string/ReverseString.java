package string;

public class ReverseString {
    public static void main(String[] args) {
        reverseString();
    }

    private static void reverseString() {
        String a = "python";
        StringBuilder b = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
