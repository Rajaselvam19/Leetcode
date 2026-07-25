class Solution {
    public int subtractProductAndSum(int n) {
        int num=n;
        int temp=1;
        int temp1=0;
        while(n!=0){
            int a=n%10;
            temp=temp*a;
            n=n/10;
             int b=num%10;
             temp1=temp1+b;
             num=num/10;
        }
        int c=(temp-temp1);
        return c;
    }
}