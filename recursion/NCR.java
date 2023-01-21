package recursion;

public class NCR {

    static int factorial(int n) {
        if (n == 0) return 1;
        return factorial(n - 1) * n;
    }

    static int nCr(int n, int r) {
        int num, den;
        num = factorial(n);
        den = factorial(r) * factorial(n - r);

        return num / den;
    }

    static int NCR(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        return NCR(n - 1, r - 1) + NCR(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCr(4, 2));
    }
}
