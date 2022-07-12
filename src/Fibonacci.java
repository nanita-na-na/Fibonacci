public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciEffective(100)); // add your number
    }
    private static int fibonacciEffective (int n) {
        int [] arr = new int[n +1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i =2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
            return arr[n];
        }
}
