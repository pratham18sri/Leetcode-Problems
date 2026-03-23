class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total +=nums[i];
        }
        int leftsum = 0;
        //total=leftsum+nums[i]+rightsum
        // for leftsum==rightsum isme total=2*leftsum+nums[i] [leftsum=rightsum] ho jaygea
        for(int i=0;i<n;i++){
            if(leftsum == total - leftsum - nums[i] ){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
        
    }
}