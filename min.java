import java.util.*;

public class Q24 {
public static int minimum(int[] arr, int index) {
if (index == arr.length - 1) {
return arr[index];
}
    int min = minimum(arr, index + 1);

    if (arr[index] < min) {
        return arr[index];
    }

    return min;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(minimum(arr, 0));
}

}
