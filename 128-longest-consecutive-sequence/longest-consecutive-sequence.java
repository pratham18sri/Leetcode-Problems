class Solution {
    public int longestConsecutive(int[] nums) {
    // ArrayList<Integer> arr=new ArrayList<>();
    // for( int i: nums){
    //     arr.add(i);
    // }
    // int maxcount=1;
    // int i=0;
    // while( i< nums.length){
    //     int currcount=1;
    //     if(arr.contains(nums[i]+1)){
    //         currcount++;
    //     }   
    // }
    Arrays.sort(nums);
    int max=1;
    int count=1;
    if( nums.length==0) return 0;
    for(int i=1;i<nums.length;i++) {
        if(nums[i] ==nums[i-1]) {
            continue; // skip duplicates
        }
        if (nums[i]==nums[i-1]+1) {
            count++;    
        } else{
            count=1;
        }
        max=Math.max(max,count);
        }
    return max;
    }
}