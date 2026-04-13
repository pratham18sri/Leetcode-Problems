class Solution {
    public int findDuplicate(int[] nums) {
        // use hashmap store freq when freq more than 1 retunr that value
        HashMap<Integer,Integer> map=new HashMap<>();
        for( int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        } 
        int ans=-1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey(); // return duplicate number
            }
        }
        return -1;
    }
}