7-import java.util.*;
public class stringreverse {
    public static void stringreverse(int left, int right, char[] str) {
        if (left >= right) {
            return;
        }
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
        stringreverse(left + 1, right - 1, str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        stringreverse(0, str.length - 1, str);
        System.out.println(str);
    }
}
