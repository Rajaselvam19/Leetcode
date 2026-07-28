class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        maxsum=sum;
        for(int i=k;i<arr.length;i++){
        sum=sum+arr[i];
        sum=sum-arr[i-k];
        maxsum=Math.max(maxsum,sum);
        }
       double result=(double)maxsum/k;
       return result;
    }
}