class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for( int i: nums){
            total+=i;
        }
        //total=leftsum+nums[i]+rightsum
        int leftsum=0;
        for( int i=0;i<nums.length;i++){
            if( leftsum==total-leftsum-nums[i]){// rightsum=total - leftsum - nums[i]
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}