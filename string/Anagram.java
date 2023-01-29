package string;

public class Anagram {
    public static void main(String[] args) {
        anagram();
    }

    private static void anagram() {
        char[] a = "decimal".toCharArray();
        char[] b = "medical".toCharArray();
        char[] res = new char[26];
        boolean isAnagram = true;

        for (int unicode : a) {
            res[unicode - 97]++;
        }
        for (int unicode : b) {
            res[unicode - 97]--;
        }

        for (int u : res) {
            if (u > 0) {
                isAnagram = false;
                break;
            }
        }
        if (!isAnagram) System.out.print("Not a Anagram");
        else System.out.print("Is an ANAgram");


    }
}
