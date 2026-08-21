class Solution {
    public int trap(int[] nums) {
        int n= nums.length;
        int left[]= new int[n];
        int maxleft=0;
        for( int i=0;i< nums.length;i++){
            int currmax= nums[i];
            maxleft= Math.max(maxleft, currmax);
            left[i]= maxleft;
        }
        int right[]= new int[n];
        int maxright=0;
        for( int i= nums.length-1;i>=0;i--){
            int currmax= nums[i];
            maxright=Math.max(maxright, currmax);
            right[i]= maxright;
        }

        int sum=0;
        for( int i=0;i< nums.length;i++){
            sum+=Math.min(left[i],right[i])- nums[i];
        }
        return sum;
    }
}