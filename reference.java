public class Reference {

    public static void main(String[] args) {
        int n = 6;

        System.out.println(fibonacci(n));
    }

    // f(n) = f(n-1) f(n-2)
    private static long fibonacci(int n) {
        if (n<= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}