class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int temp=0;
        while(x>0){
            int arr=x%10;
            temp=10*temp+arr;
            x=x/10;
        }
        if(temp==num){
            return true;
        }
         
         return false;
    }
}