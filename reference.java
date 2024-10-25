public class Reference {

    public static void main(String[] args) {
        int n = 10;
        int[] nFibTerms = new int[n];

        for (int i=0; i<nFibTerms.length; i++) {
            nFibTerms[i] = fibonacci(i);
        }
        listArray(nFibTerms);
    }

    // f(n) = f(n-1) f(n-2)
    private static int fibonacci(int n) {
        if (n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static void listArray(int[] arr) {
        for (int a:arr) {
            System.out.println(a);
        }
    }

}