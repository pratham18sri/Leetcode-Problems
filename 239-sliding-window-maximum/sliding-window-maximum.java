// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//     //     ArrayList<Integer> arr=new ArrayList<>();
//     //     for( int i=0;i<=nums.length-k;i++){
//     //         int max=nums[i];
//     //         for(int j=i;j<i+k;j++){
//     //             max=Math.max(nums[j], max);
//     //         }
//     //         arr.add( max);
//     //     }
//     //     int res[]=new int[arr.size()];
//     //     int idx=0;
//     //     for( int i: arr){
//     //         res[idx++]=i;
//     //     }
//     //     return res;
//     // }

// }
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || k == 0) return new int[0];

        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove index out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove smaller values from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store result once window size is k
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
