class Solution {
    public int distributeCandies(int[] nums) {

         
        // int count=1;
        // for(int i=1;i< nums.length;i++){
        //     if(nums[i-1]!= nums[i]){
        //         count++;      
        //         if(count==nums.length/2){
        //             break;
        //         } 
        //     }
        // }
        // return count;

        Set<Integer> set= new HashSet<>();
        for( int i: nums){
            set.add(i);
        }
        return Math.min(set.size(), nums.length/2);
    }
}