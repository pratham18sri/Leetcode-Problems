class Solution {
    public int removeDuplicates(int[] nums) {
        // appply two pointer fro this and solve thjs problem in O(N)
        // int i=0,j=0;
        // while(j<nums.length){
        //     if(nums[i]!=nums[j]){
        //         i++;
        //         nums[i]=nums[j];
        //     }
        //     j++;
        // }
        //  
        // return i+1;
        
        // now solve useing set
        Set<Integer> set=new LinkedHashSet<>();
        for( int i: nums){
            set.add(i);
        }
        int idx=0;
        for( int i: set){
            nums[idx++]=i;
        }
        return set.size();
    }
}