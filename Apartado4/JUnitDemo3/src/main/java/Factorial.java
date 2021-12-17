public class Factorial {
    public static int calcula(int n) {
        if (n<2) {
            return 1;
        }
        return n * calcula(n - 1);
    }
}