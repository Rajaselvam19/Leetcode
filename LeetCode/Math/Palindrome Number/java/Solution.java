class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int temp=0;
        while(x!=0){
            int a=x%10;
            temp=temp*10+a;
          x=x/10;
        } 
        return num==temp;
    }
}