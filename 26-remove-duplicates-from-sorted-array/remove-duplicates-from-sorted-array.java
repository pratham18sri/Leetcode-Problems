class Solution {
    public int removeDuplicates(int[] nums) {
        // appply two pointer fro this and solve thjs problem in O(N)
        int i=0,j=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}