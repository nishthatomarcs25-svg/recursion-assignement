import java.util.*;

public class Q23 {
public static int maximum(int[] arr, int index) {
if (index == arr.length - 1) {
return arr[index];
}
    int max = maximum(arr, index + 1);

    if (arr[index] > max) {
        return arr[index];
    }

    return max;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(maximum(arr, 0));
}

}
