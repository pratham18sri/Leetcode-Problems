import java.util.*;

class Solution {
    public long smallestNumber(long num) {
        if (num == 0) return 0;
        boolean isNegative = num < 0;
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        if (isNegative) {
            // reverse for negative
            reverse(digits);
            return -Long.parseLong(new String(digits));
        } else {
            // move first non-zero digit to front
            int i = 0;
            while (digits[i] == '0') i++;
            char temp = digits[0];
            digits[0] = digits[i];
            digits[i] = temp;
            return Long.parseLong(new String(digits));
        }
    }
    private void reverse(char[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
