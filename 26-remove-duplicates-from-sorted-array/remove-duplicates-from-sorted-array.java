class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set=new HashSet<>(); se ho jaygea or 2 pointer se bhi 
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