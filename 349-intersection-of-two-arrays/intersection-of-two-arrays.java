class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set= new HashSet<>();
        for( int i: nums1){
            set.add(i);
        }
        Set<Integer> intersectSet = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                intersectSet.add(i);
            }
        }
        int ar[]= new int[intersectSet.size()];
        int idx=0;
        for( int i: intersectSet){
            ar[idx++]=i;
        }
        return ar;
    }
}