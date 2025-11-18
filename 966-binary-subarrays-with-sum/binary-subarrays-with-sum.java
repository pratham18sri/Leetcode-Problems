class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // isme hum kya karnege at most nikal lenge jese 14-10=4 
        // 14 yha toatl subaraay hai jinka sum<=goal hia 
        // 10 yha total sbarray hai jika sum<=goal-1 hai 
        // to humare 4 subarray hai jinka sum=goal hai

        //  nhi smj aya samjata hu y dekh lio smj jayega 
        // (all subarrays with sum ≤ goal)
        // − (all subarrays with sum ≤ goal - 1)
        // --------------------------------------------------
        // = ONLY the subarrays with sum = goal
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost( int nums[],int goal){
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        if( goal<0) return 0;
        while(j<nums.length){
            sum+=nums[j];
            // ager sum bada hoga to window ko srink karnge;
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}