class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=nums.length;
        int i=0;
        int j=0;
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        while( j<size){
            sum+=nums[j];
            while( sum>=target){
                sum-=nums[i];
                minlength=Math.min(minlength,j-i+1);
                i++;
            }
            j++;
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
        

    }
}