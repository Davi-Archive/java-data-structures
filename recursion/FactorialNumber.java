package recursion;

public class FactorialNumber {

    static int factorial(int n) {
        if (n == 0 || n < 0) return 1;
        System.out.println("fun " + n + " x " + (n - 1));
        return factorial(n - 1) * n;
    }

    static int Ifactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            System.out.println("loop factorial "+f);
        }
        return f;
    }

    public static void main(String[] args) {
        int r = factorial(5);
        System.out.println("RESULT REcur" + r);
        int r2 = Ifactorial(5);
        System.out.println("RESULT Loop" + r2);
    }
}
