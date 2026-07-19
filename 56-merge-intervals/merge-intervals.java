class Solution {
    public int[][] merge(int[][] intervals) {
        // nextStart <= currentEnd
        // Current = [1,3]
        // Next    = [2,6]
        // 2 <= 3   → overlap
        // So merge them:
        // newStart = 1
        // newEnd = max(3,6) = 6
        // Merged = [1,6]

        //  first sort according to starting index
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        // add ans to new list
        List<int []> res= new ArrayList<>();

        //  provide start and end
        int start= intervals[0][0];
        int end= intervals[0][1];

        //  now run as loop
        for(int i=1;i< intervals.length;i++){
            // overlap
            if( intervals[i][0]<= end){
                // merge
                end=Math.max(end, intervals[i][1]);
            }else{
                // not overlape
                res.add(new int[]{start, end});
                start= intervals[i][0];
                end= intervals[i][1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][]);
    }
}
