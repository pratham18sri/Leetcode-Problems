class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int maxleft=0;
        for( int i=0;i< n;i++){
            int curr=height[i];
            maxleft=Math.max(curr,maxleft);
            left[i]=maxleft;
        }
        int right[]=new int[n];
        int maxright=0;
        for( int i=n-1;i>=0;i--){
            int curr=height[i];
            maxright=Math.max(curr,maxright);
            right[i]=maxright;
        }
        int sum=0;
        for( int i=0;i< n;i++){
            sum+=Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}