class Solution {
    public int lengthOfLastWord(String s) {
        String a=s.trim();
        String[] num=a.split(" ");
        String arr=num[num.length-1];
        int b=arr.length();

        return b;
    }
}