class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size();
        int breaks=0;
        int breakcount=-1;
        for( int i=0;i< n-1;i++){
            if( nums.get(i)>nums.get(i+1)){
                breaks++;
                breakcount=i;
            }
        }
        if (breaks == 1 && nums.get(n - 1) > nums.get(0)) {
            return -1;
        }
        if( breaks>1) return -1;
        if( breaks==0) return 0;
        return n-(breakcount+1);
    }
}