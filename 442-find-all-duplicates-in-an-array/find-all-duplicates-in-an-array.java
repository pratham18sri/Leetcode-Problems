class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        ArrayList<Integer> arr= new ArrayList<>();
        for( int i: nums){
            if(set.contains(i)){
                arr.add(i);
            }
            set.add(i);
        }
        return arr;
        // int idx=0;
        // int arr[]= new int[list.size()];
        // for( int i: list){
        //     arr[idx++]=i;
        // }
        // return 
    }
}