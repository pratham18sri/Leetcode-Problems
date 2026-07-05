class Solution {
    public int maxSubArray(int[] nums) {

        // --------TLE------------
    //    int max=Integer.MIN_VALUE;
    //    for(int i=0;i< nums.length;i++){
    //     int sum= nums[i];
    //     max=Math.max(max,sum);
    //     for( int j=i+1;j< nums.length;j++){
    //         sum+= nums[j];
    //         max=Math.max(max,sum);
    //     }
    //    }
    //    return max;
    int currsum= nums[0];
    int max= nums[0];
    for( int i=1;i< nums.length;i++){
        currsum=Math.max(nums[i],currsum+nums[i]);
        max=Math.max(max, currsum);
    }
    return max;



    }
}