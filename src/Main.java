public class Main {

    public static int fibbon(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibbon(n - 1) + fibbon(n - 2);
    }

    public  static void main(String[] args) {

        int n = 10;
        int result = fibbon(n);
        System.out.println("The "+ n +" term in the Fibonacci sequence is "+result);
    }
}
