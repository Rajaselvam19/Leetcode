class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int length = Math.min(nums1.length, nums2.length);
        int[] arr = new int[length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int size = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                arr[size] = nums1[i];
                size++;
                i++;
                j++;
            }
        }

        int m = 0;
        for (int l = 0; l < size; l++) {
            if (m == 0 || arr[l] != arr[m - 1]) {
                arr[m] = arr[l];
                m++;
            }
        }

        int[] res = new int[m];
        for (int k = 0; k < m; k++) {
            res[k] = arr[k];
        }

        return res;
    }
}