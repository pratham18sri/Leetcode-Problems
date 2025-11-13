class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1;
        while(n>0){
            int s=n%10;
            sum+=s;
            pro*=s;
            n=n/10;
        }
        return pro-sum;
    }
}