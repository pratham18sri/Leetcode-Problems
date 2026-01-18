class Solution {
    public double myPow(double x, int n) {
       
            double ans= Math.pow(x,n);
            return Math.round(ans*100000.0)/100000.0;
    }
}