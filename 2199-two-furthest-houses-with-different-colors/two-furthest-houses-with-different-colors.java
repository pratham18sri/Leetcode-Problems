class Solution {
    public int maxDistance(int[] nums) {
        int n=nums.length;
        int start=0;
        int max=0;
        for( int i=1;i< n;i++){
            if(nums[start]!=nums[i]){
            int diff=Math.abs(i-start);
            max=Math.max(max,diff);
            }
        }
        for( int i=n-2;i>=1;i--){
            if(nums[n-1]!=nums[i]){
            int diff=Math.abs((n-1)-i);
            max=Math.max(max,diff);
        }
        }
        return max;
    }
}