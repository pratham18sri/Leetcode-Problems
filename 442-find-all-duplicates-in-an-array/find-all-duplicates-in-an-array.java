class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        for( int i: nums){
            if(set.contains(i)){
                list.add(i);
            }
            set.add(i);
        }
        return list;
    }
}