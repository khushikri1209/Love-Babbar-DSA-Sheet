import java.util.*;

public class J03KthMaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;

        Arrays.sort(arr);

        int kthMin = arr[k - 1];              
        int kthMax = arr[arr.length - k];    

        System.out.println("Kth Smallest: " + kthMin);
        System.out.println("Kth Largest: " + kthMax);
    }
}
