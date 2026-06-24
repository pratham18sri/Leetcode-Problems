import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int m = p.length();
        int n = s.length();
        if (m > n) return result;
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);

        for (int i = 0; i <= n - m; i++) {
            String window = s.substring(i, i + m);
            char[] windowArr = window.toCharArray();
            Arrays.sort(windowArr);

            if (sortedP.equals(new String(windowArr))) {
                result.add(i);
            }
        }
        return result;
    }
}