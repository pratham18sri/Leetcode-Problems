class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for( int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for( int j=i;j< nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;

        int curr=0;
        int res=0;
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for( int i: nums){
            curr+=i;
            res+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;

    }
}