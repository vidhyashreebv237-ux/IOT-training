package day2;

public class p19 {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println("Factorial = " + result);
    }
}