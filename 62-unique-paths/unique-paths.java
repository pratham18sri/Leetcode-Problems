class Solution {
    public int uniquePaths(int m, int n) {
        // You must move down exactly m − 1 time
        // You must move right exactly n − 1 times
        // (m−1)+(n−1)=m+n−2
        // unique path=(m+n-2)!/(m-1)!(n-1)!
        long N = m + n - 2;
        long r = Math.min(m - 1, n - 1);
        long res = 1;
        for (int i= 1; i <= r; i++) {
            res =res * (N - r + i) / i;
        }
        return (int) res;
    }
}