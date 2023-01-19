package data001.recursion;

public class PowerRecursion {

    static double power(double m, double n) {
        if (n == 0) return 1;
        return power(m, n - 1) * m;
    }

    static double power2(double m, double n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return power2(m * m, n / 2);
        return m * power2(m * m, (n - 1) / 2);
    }

    public static void main(String[] args) {
        double r = power(2, 9);
        System.out.println("RESULT " + r);
        double r2=power2(2,9);
        System.out.println("RESULT " + r2);

    }
}
