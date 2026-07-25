class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        String[] words = s.split("\\s+"); // Split by one or more spaces
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" "); // Add space between words
        }

        return sb.toString();
    }
}
