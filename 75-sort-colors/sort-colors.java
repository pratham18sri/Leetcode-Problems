class Solution {
    public void sortColors(int[] nums) {
        int zero=0;int one=0;int two=0; 
        for( int i: nums){
            if( i==0) zero++;
            else if( i==1) one++;
            else two++;
        }
        int idx=0;
        while( zero-->0) nums[idx++]=0;
        while( one-->0) nums[idx++]=1;
        while( two-->0) nums[idx++]=2;
    }
}