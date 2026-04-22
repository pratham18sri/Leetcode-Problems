import java.util.*;

class Solution {
    
    public int calnext(int[] nums, int curr) {
        int n = nums.length;
        return ((curr + nums[curr]) % n + n) % n;
    }

    public boolean circularArrayLoop(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            
            Set<Integer> set = new HashSet<>();
            boolean ispos = nums[i] > 0;
            int curr = i;

            while (true) {
                int next = calnext(nums, curr);

                // ❌ self loop not allowed
                if (next == curr) break;

                // ❌ direction change
                if (ispos && nums[next] < 0) break;
                if (!ispos && nums[next] > 0) break;

                // ✅ cycle found
                if (set.contains(next)) {
                    return true;
                }

                set.add(next);
                curr = next;
            }
        }
        return false;
    }
}