class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int i = 0, j = 0, count = 0;
        int odd = 0;

        while (j < nums.length) {

            if (nums[j] % 2 != 0) {
                odd++;
            }

            while (odd > k) {
                if (nums[i] % 2 != 0) odd--;
                i++;
            }

            count += (j - i + 1);
            j++;
        }

        return count;
    }
}
