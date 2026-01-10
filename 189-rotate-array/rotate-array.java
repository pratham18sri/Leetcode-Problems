class Solution {
    private void rotation(int [] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        // roatate complete 
        k=k%nums.length;
        rotation(nums,0,nums.length-1);
        rotation(nums,0,k-1);
        rotation(nums,k,nums.length-1);
    }
}