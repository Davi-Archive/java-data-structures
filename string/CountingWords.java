package string;

public class CountingWords {

    public static void main(String[] args) {
        wordsCounter();
    }

    private static void wordsCounter() {
        char[] a = {'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u'};

        int i = 0, word = 0;

        for (; i < a.length; i++) {
            if (a[i] == ' ' && a[i - 1] != ' ') {
                word++;
            }
        }
        System.out.println("WORDS => " + (word + 1));
    }
}
