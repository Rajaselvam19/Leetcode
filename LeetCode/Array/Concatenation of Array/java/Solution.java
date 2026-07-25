class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int[] number=new int[2*a];
        for(int i=0;i<a;i++){
            number[i]=nums[i];
            number[i+a]=nums[i];

        }
        return number;
    }
}