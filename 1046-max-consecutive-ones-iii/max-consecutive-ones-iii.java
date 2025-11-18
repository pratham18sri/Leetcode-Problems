class Solution {
    public int longestOnes(int[] nums, int k) {
        int starting_k=k;
        int i=0;
        int j=0;
        int maxlength=-1;
        while(j<nums.length){
            // ager 0 hai to k ek kam hota jayega 
            if( nums[j]==0){
                k--;
            }
            // ager k 0 n neche chala gaya mena negative m to fir check karnege ki i bhi 0 hia kya ager i 0 hoga to k ko ek bada denge or window ko shringk kar denge i++ kar k
            while(k<0){
                if( nums[i]==0){
                    k++;
                }
                i++;
            }
            // maxlength heck karte jayenge each window k liye privous maclength se or j ko increase karte chalenge
            maxlength=Math.max(maxlength,j-i+1);
            j++;    
        }
        return maxlength;
    }
}