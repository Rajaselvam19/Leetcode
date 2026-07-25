class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return -1; // empty party, no VIPs 

        // Step 1: find smallest & biggest numbers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Step 2: make a guest list (count array)
        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : nums) {
            count[num - min]++; // shift by min to fit index
        }

        // Step 3: walk from the VIPs down
        for (int i = range - 1; i >= 0; i--) {
            k -= count[i]; // kick out wallflowers while counting
            if (k <= 0) {
                return i + min; // found our VIP
            }
        }

        return -1; // should never happen unless the party is empty
    }
}