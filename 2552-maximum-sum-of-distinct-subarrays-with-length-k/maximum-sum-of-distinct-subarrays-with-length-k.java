class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        long sum=0;
        long maxsum=0;
        int left=0;
        for( int right=0;right< nums.length;right++){
            // yha duplicate dekh lenge hoga to left side se set ko kam karenge
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            // sum karta jayega
            set.add(nums[right]);
            sum+=nums[right];
            //window k size k hone par max sum or window dono ko update karenge
            if(right-left+1==k){
                maxsum=Math.max(maxsum,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxsum;
    }
}