class Solution {
    public int[] transformArray(int[] nums) {
        int a=nums.length;
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
        if(nums[i]%2==0){
            arr[i]=0;
        }
        else{
            arr[i]=1;
        }
    }
   Arrays.sort(arr);
   return arr;
}
}