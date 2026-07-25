class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefix = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        return mergeSort(prefix, 0, prefix.length - 1, lower, upper);
    }

    private int mergeSort(long[] prefix, int left, int right, int lower, int upper) {
        if (left >= right) return 0;
        int mid = (left + right) / 2;
        int count = mergeSort(prefix, left, mid, lower, upper)
                  + mergeSort(prefix, mid + 1, right, lower, upper);

        int j = mid + 1, k = mid + 1, t = mid + 1;
        long[] temp = new long[right - left + 1];
        int r = 0;

        for (int i = left; i <= mid; i++) {
            //we are doing prefix[k]-prefix[i] because we have 2 sorted halves(merge sort logic we combine and sort them as whole later)
            //we know k is starting from mid+1 so definately prefix[k] will contain the sum till prefix[mid] atleast
            //so now when prefix[i] is being substracted from prefix[k] we are simply
            //removing prefix[i] from prefix[k] because prefix[k] basically contains prefix[i] in it 
            //by removing it we get the remaining sum that is from i to all the way to k that is a valid range
            //i may be starting from left but it is sorted so prefix sum are all jumbled  
            //so it may look random like suppose from 0 to 2 the sum is more that 0 to 5 due to negative values
            //so now value of prefix sum of 0 to 5 will be placed before than prefix sum of 0 to 2
            //then now suppose middle is at 7 and k is 11 , then prefix[0 to 5] will be substracted from prefix of k
            //which is prefix sum of 0 to 11 we get sum from 5 to 11 which is a valid range
            //after that we are just checking which of these ranges are below than low and which are below upper
            //substracting upper - lower we get all the ranges that is not lower than low and which are lower than upper
            //since we removed ranges that were less than lower from the range which were lesser than upper 
            //therefore we get the desired range
            //in the third while loop temp is helper array that we used to use in merge logic in merge sort
            //you can skip this third while loop and the statement below that is
            //temp[r++]=prefix[i] and you can sort the prefix array using another merge function where you use helper array in merge logic of two sorted arrays
            //and store the whole sorted order in a helper array by comparing two sorted arrays 
            //in any way logic is same
            while (k <= right && prefix[k] - prefix[i] < lower) k++;
            while (j <= right && prefix[j] - prefix[i] <= upper) j++;
            while (t <= right && prefix[t] < prefix[i]) temp[r++] = prefix[t++];
            temp[r++] = prefix[i];
            count += j - k;
        }

        System.arraycopy(temp, 0, prefix, left, r);
        return count;
    }
}
