class Solution {
    public boolean isHappy(int n) {
        while(n>=7){
            int sum=0;
            while(n!=0){
                int d=n%10;
                int e=d*d;
                sum=sum+e;
                n=n/10;
            }n=sum;
        } 
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}