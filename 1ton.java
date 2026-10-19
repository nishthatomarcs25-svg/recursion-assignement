1-import java.util.*;
public class natural {
    public static int natural(int n) {
        if(n == 0) {
            return 0;
        }
        return n + natural(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(natural(n));
    }
}
