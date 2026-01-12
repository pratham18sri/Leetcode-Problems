class Solution {
    private int findfirst( int nums[], int target){
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while( i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                ans=mid;
                j=mid-1;
            }
            else if( nums[mid]<target){
             i=mid+1;
            }
            else{
                j=mid-1;
            }
            
         }
        return ans;
    }
    private int findlast( int nums[], int target){
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while( i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                ans=mid;
                i=mid+1;
            }
            else if( nums[mid]<target){
             i=mid+1;
            }
            else{
                j=mid-1;
            }
            
         }
         return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        res[0]=findfirst( nums,target);
        res[1]=findlast( nums,target);
        return res;

    }
}