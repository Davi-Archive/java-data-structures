package data001;

public class TreeRecursion {
    public static void main(String[] args) {
        fun(3);
    }

    public static void fun(int n) {
        if (n > 0) {
            System.out.printf("%d %n", n);
            fun(n - 1);
            fun(n - 1);
        }
    }
}

