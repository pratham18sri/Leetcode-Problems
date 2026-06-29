class Solution {
    public List<Integer> stableMountains(int[] nums, int t) {
        ArrayList<Integer> arr= new ArrayList<>();
        for( int i=1;i< nums.length;i++){
            if( nums[i-1]>t ){
                arr.add(i);
            }
        }
        return arr;
    }
}