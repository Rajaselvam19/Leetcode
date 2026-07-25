import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] arr) {
        int prod = 1;
        int zc = 0;     // zero count
        int ind = -1;   // index of zero
        int[] new_arr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zc++;
                ind = i;
                if (zc > 1) { // more than one zero, all products = 0
                    return new_arr; // all zeros
                }
            } else {
                prod *= arr[i];
            }
        }

        if (zc == 1) {
            new_arr[ind] = prod; // only index with zero gets the product
        } else {
            for (int i = 0; i < arr.length; i++) {
                new_arr[i] = prod / arr[i];
            }
        }
        return new_arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1, 2, 3, 4};
        int ans[] = sol.productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
}