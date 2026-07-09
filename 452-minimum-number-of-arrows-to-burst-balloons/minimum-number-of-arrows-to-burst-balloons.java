import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int[] prev = points[0];
        int count = 1;

        for (int i = 1; i < points.length; i++) {

            int currStart = points[i][0];
            int currEnd = points[i][1];

            int prevStart = prev[0];
            int prevEnd = prev[1];

            // No overlap
            if (currStart > prevEnd) {
                count++;
                prev = points[i];
            }
            // Overlap
            else {
                prev[0] = Math.max(prevStart, currStart);
                prev[1] = Math.min(prevEnd, currEnd);
            }
        }

        return count;
    }
}