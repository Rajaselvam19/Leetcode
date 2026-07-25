class Solution {
    public int rob(int[] nums) {
        int p1 = 0, p2 = 0, ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans = Math.max(p2, nums[i] + p1); //rob or not to rob
            p1 = p2; // move memory
            p2 = ans; // update max loot
        }
        return ans; // max coins you walked away with
    }
}