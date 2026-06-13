class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left=-1;
        int right=-1;
        int maxseen=nums[0];
        for( int i=1;i< nums.length;i++){
            maxseen=Math.max(maxseen, nums[i]);
            if(nums[i]<maxseen) right=i;
        }
        int minseen=nums[nums.length-1];
        for( int i=nums.length-2;i>=0;i--){
            minseen=Math.min(minseen, nums[i]);
            if( nums[i]> minseen) left=i;
        }
        return right == -1 ? 0 : right - left + 1;
    }
}