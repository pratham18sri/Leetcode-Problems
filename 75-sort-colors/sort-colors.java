class Solution {
    public void sortColors(int[] nums) {
        for(int i=1;i<=nums.length;i++){
            boolean swap=false;
            for ( int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if( swap==false) break;
        }
    }
}