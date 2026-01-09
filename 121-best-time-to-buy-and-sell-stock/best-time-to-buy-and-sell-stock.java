class Solution {
    public int maxProfit(int[] nums) {
        // int i=0;
        // int j=nums.length-1;
        // int max=0;
        // while(i<j){
        //     int curr=0;
        //     if(nums[i]>nums[j]){
        //         i++;
        //     }
        //     else{
        //        curr=nums[j]-nums[i];
        //        j--;
        //        max=Math.max(curr,max); 
        //     }
        // }
        int min=nums[0];
        int max=0;
        for( int i=1;i< nums.length;i++){
            if( nums[i]<min){
                min=nums[i];//buy 
            }
            else{
                max=Math.max(max,nums[i]-min);
            }
        }
        return max;
    }
}