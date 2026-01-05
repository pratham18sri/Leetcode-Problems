class Solution {
    public int trap(int[] nums) {
        //  first we calculate the max for left 
        int left[]=new int[nums.length];
        int max1=0;
        for( int i=0;i<nums.length;i++){
            int curr=nums[i];
            max1=Math.max(curr,max1);
            left[i]=max1;
        }
        // now calculate max for rights
        int right[]=new int[nums.length];
        int max2=0;
        for( int i=nums.length-1;i>=0;i--){
            int curr=nums[i];
            max2=Math.max(curr,max2);
            right[i]=max2;
        }
        // use formula and calculate
        int sum=0;
        for( int i=0;i<nums.length;i++){
            sum+=Math.min(left[i],right[i])-nums[i];
        }
        return sum;
        //  better understanding through this   https://www.youtube.com/watch?v=UZG3-vZlFM4&t=440s
    }
}