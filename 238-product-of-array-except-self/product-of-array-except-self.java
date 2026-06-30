class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int[nums.length];
        int mul=1;
        int zcount=0;
        for( int i=0;i< nums.length;i++){
            if( nums[i]==0) zcount++;
            else{
                mul*= nums[i];
            }
        }
        for( int i=0;i< nums.length;i++){
            if(zcount>1) res[i]=0;
            else if(zcount==1){
                if( nums[i]==0) res[i]= mul;
                else res[i]=0;
            }
            else{
                res[i] = mul / nums[i];
            }
        }
        return res;
    }
}