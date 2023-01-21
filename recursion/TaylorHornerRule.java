package recursion;

public class TaylorHornerRule {
    static double s;

    static double e(int x, int n) {
        if (n == 0) return s;
        s = 1 + x * s / n;
        return e(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(e(1, 10));
    }
}
