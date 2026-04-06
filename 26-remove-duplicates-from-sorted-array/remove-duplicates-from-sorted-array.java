class Solution {
    public int removeDuplicates(int[] nums) {
        // if we done this using SET sapce complexity increase by O(N)
        // O(N) time complexity
        int i=0;
        int j=0;
        while(j< nums.length){
            if( nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}