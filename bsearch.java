import java.util.*;

public class Q26 {
public static int binarySearch(int[] arr, int x, int low, int high) {
if (low > high) {
return -1;
}
    int mid = low + (high - low) / 2;

    if (arr[mid] == x) {
        int leftResult = binarySearch(arr, x, low, mid - 1);

        if (leftResult != -1) {
            return leftResult;
        }

        return mid;
    }

    if (arr[mid] < x) {
        return binarySearch(arr, x, mid + 1, high);
    }

    return binarySearch(arr, x, low, mid - 1);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(binarySearch(arr, x, 0, n - 1));
}

}
