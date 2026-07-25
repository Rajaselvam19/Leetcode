class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] num : accounts){
            int sum=0;
            for(int i:num){
                sum=sum+i;
            }
            if(sum>max){
                max=sum;
            }
        }return max;
    }
}