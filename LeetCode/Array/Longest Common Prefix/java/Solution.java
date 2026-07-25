public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";        // empty array
        if (strs.length == 1) return strs[0];   // only one string

        String prefix = strs[0]; // start with first string

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            // Compare characters one by one
            while (j < prefix.length() && j < strs[i].length() 
                   && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            // Cut prefix to the matching part
            prefix = prefix.substring(0, j);
            if (prefix.equals("")) return ""; // no common prefix
        }

        return prefix; // return the final prefix
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(sol.longestCommonPrefix(strs2)); // Output: ""
    }
}