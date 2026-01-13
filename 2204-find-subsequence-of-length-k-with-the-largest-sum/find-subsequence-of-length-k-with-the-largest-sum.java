class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Step 1: copy & sort
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // Step 2: store top k elements with frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = sorted.length - 1; i >= sorted.length - k; i--) {
            freq.put(sorted[i], freq.getOrDefault(sorted[i], 0) + 1);
        }

        // Step 3: build result preserving order
        int[] res = new int[k];
        int idx = 0;

        for (int num : nums) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                res[idx++] = num;
                freq.put(num, freq.get(num) - 1);
                if (idx == k) break;
            }
        }

        return res;
    }
}
