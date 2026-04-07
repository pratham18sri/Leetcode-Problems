class Solution {
    public void sortColors(int[] nums) {
        int zeroC=0;
        int oneC=0;
        int twoC=0;
        for( int i=0;i< nums.length;i++){
            if( nums[i]==0) zeroC++;
            else if( nums[i]==1) oneC++;
            else twoC++;
        }
        int idx = 0;
        while (zeroC-- > 0) nums[idx++] = 0;
        while (oneC-- > 0) nums[idx++] = 1;
        while (twoC-- > 0) nums[idx++] = 2;
        
    }
}