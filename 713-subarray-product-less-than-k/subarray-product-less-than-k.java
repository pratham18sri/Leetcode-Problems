class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int count=0;
        //  for( int i =0;i< nums.length;i++){
        //     int mul=1;
        //     for( int j=i;j< nums.length;j++){
        //         mul*=nums[j];
        //         if( mul>=k) break;
        //         count++;
        //     }
        //  }
        //  return count;


        // with sliding window
        if (k <= 1) return 0;

    int left = 0;
    int product = 1;
    int count = 0;
    for (int right = 0; right < nums.length; right++) {
        product *= nums[right];

        while (product >= k) {
            product /= nums[left];
            left++;
        }

        count += right - left + 1;
    }

    return count;
    }
}