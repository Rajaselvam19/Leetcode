class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        CyclicSort(nums, n);
        int j = 0;
        int i = 1;
        while (j < n) {
            if (nums[j] != i) {
                return i;
            }
            i++;
            j++;
        }
        return n + 1;
    }

    void CyclicSort(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i);
            } else {
                i++;
            }
        }
    }

    void swap(int[] arr, int i) {
        int temp = arr[arr[i] - 1];
        arr[arr[i] - 1] = arr[i];
        arr[i] = temp;
    }
}