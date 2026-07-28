class Solution {
    public int numOfSubarrays(int[] arr, int k, int M) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
         sum=sum+arr[i];   
        }   
            int avg=sum/k;
            if(avg>M||avg==M){
                count++;
         }
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
              int num=sum/k;
            if(num>M||num==M){
                count++;
            } 
        }
            return count;
    }
}