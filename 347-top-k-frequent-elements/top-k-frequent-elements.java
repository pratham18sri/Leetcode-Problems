class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();
        for( int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        // Put all keys into ArrayList
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(entry.getKey());
        }
        // Sort according to frequency
        arr.sort((a, b) -> map.get(b) - map.get(a));

        int res[]= new int[k];
        int idx=0;
        while (idx < k ){
            res[idx]=arr.get(idx);
            idx++;
        }
        return res;
    }
}