class Solution {
    public int countPartitions(int[] nums) {
       int count=0;
       int total=0;
       //collection of all sum rether than 1st one
       for( int j:nums){
        total+=j;
       }
       int sum1=0;
       for( int i=0;i<nums.length-1;i++){
        sum1+=nums[i];// sum of left side
        int sum2=total-sum1;// total -left sidw sum
        int diff=Math.abs(sum1-sum2);
        if(diff%2==0) count++;
       }
       return count;
    }
}