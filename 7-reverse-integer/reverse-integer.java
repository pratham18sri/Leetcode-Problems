class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String s = String.valueOf(Math.abs(x));
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            // overflow check (positive bound only)
            if (res > Integer.MAX_VALUE / 10 ||
               (res == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            res = res * 10 + digit;
        }
        return isNegative ? -res : res;
    }
}
