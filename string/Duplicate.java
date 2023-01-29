package string;

public class Duplicate {
    public static void main(String[] args) {
        duplicateString();
    }

    private static void duplicateString() {
        char[] a = "findings".toCharArray();
        char[] b = new char[26];

        for (char c : a) {
            b[(int) c - 97]++;
        }
        int index = 0;
        System.out.printf("DUPLICATED => ");
        for (int c : b) {
            if (c > 1) {
                char res = (char) (index + 97);
                System.out.printf(" %c", res);
            }
            index++;
        }
    }
}
