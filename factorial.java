6- import java.util.*;
public class factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fc2 = n * factorial(n - 1);
        return fc2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

