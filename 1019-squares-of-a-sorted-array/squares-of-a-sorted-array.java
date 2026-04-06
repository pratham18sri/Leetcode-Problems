class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx=0;
        for( int i=0;i< nums.length;i++){
            nums[idx++]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}