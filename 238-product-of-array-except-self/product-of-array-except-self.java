class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int zero=0;
        int count=0;
        for( int i=0;i< nums.length;i++){
            // store the zero value index;
            if(nums[i]==0){
                count++;
                zero=i;
            }
            else{
                mul*=nums[i];
            }
        }
        int ans[]=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            if(count>1){
                ans[i]=0;
            }
            else if (count == 1) {
                ans[i] =(i==zero)? mul:0;
            }
            else{
                ans[i]=mul/nums[i];
            }
        }
        return ans;
    }
}