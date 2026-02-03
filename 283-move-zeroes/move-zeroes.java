class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;
        int zeros=0;
        for( int i=0;i< nums.length;i++){
            if( nums[i]!=0){
                nums[idx++]=nums[i];
            }
            else{
                zeros++;
            }
        }
        for(int i=nums.length-zeros;i< nums.length;i++){
            nums[idx++]=0;
        }
        
    }
}