class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        for( int i=0;i< nums.length;i++){
            for( int j=i+1;j<nums.length;j++){
                if( nums[i]+nums[j]==target){
                    arr.add(i);
                    arr.add(j);
                    break;
                }
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}