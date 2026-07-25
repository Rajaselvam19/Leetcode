

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String vowels = "aeiou";

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxVowel = 0;
        int maxCons = 0;

        for (char c : map.keySet()) {
            if (vowels.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, map.get(c));
            } else {
                maxCons = Math.max(maxCons, map.get(c));
            }
        }

        return maxVowel + maxCons;
    }
}