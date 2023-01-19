package data001.recursion;

public class RecursionFirstNaturalNumber {


    static int sum(int n) {
        if (n == 0) return 0;
        System.out.println("SUM " + n);
        return sum(n - 1) + n;
    }

    static int Isum(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + i;
            System.out.println("ISUM " + s);
        }
        return s;
    }

    public static void main(String[] args) {
        int r = sum(5);
        int r2 = Isum(5);
        System.out.println("PURE SUM "+r);
        System.out.println("I SOMA " + r2);

    }
}
