package data001.recursion;

public class Fibbonaci {
    static int t0 = 0, t1 = 1, s, i;

    static int fib(int n) {
        if (n <= 1) return n;
        for (i = 2; i <= n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }

    static int rfib(int n) {
        if (n <= 1) return n;
        return rfib(n - 2) + rfib(n - 1);
    }

    static int[] F = new int[10];

    static int mfib(int n) {
        if (n <= 1) {
            F[n] = n;
            System.out.println(n);
            return n;
        } else {
            if (F[n - 2] == -1) {
                F[n - 2] = mfib(n - 2);
            }
            if (F[n - 1] == -1) {
                F[n - 1] = mfib(n - 1);
            }
            System.out.println(n);
            return F[n - 2] + F[n - 1];
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            F[i] = -1;
        }

        System.out.println(mfib(5));
    }
}
