import java.util.Arrays;

class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {

                int idx = 0;
                int diff = 0;
                boolean valid = true;

                for (int k = 0; k < nums1.length; k++) {

                    if (k == i || k == j) continue;

                    if (idx == 0)
                        diff = nums2[idx] - nums1[k];

                    if (nums1[k] + diff != nums2[idx]) {
                        valid = false;
                        break;
                    }

                    idx++;
                }

                if (valid)
                    ans = Math.min(ans, diff);
            }
        }

        return ans;
    }
}
