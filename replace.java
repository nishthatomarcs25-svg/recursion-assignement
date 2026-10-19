import java.util.*;

public class Q20 {
public static String remove(String s, char ch, int index) {
if (index == s.length()) {
return "";
}

    char current = s.charAt(index);
    String result = remove(s, ch, index + 1);

    if (current == ch) {
        return result;
    }

    return current + result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    char ch = sc.nextLine().charAt(0);

    System.out.println(remove(s, ch, 0));
}

}
