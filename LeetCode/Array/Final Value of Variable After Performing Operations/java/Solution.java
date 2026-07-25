class Solution {
    public int finalValueAfterOperations(String[] op) {
  int x = 0;
        for (String num : op) {
            if (num.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}