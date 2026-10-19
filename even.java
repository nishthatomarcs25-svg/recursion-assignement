3-import java.util.*;
public class evenprint {
    public static void evenprint(int n) {
        if(n == 0) {
            return;
        }
        evenprint(n - 1);
        if(n % 2 == 0) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenprint(n);
    }
}
