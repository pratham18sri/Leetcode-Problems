class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Left → Right (top row)
        // Top → Bottom (right column)
        // Right → Left (bottom row) (if valid)
        // Bottom → Top (left column) (if valid)
        // Repeat while top <= bottom and left <= right.
        List<Integer> arr=new ArrayList<>();
        if( matrix.length==0) return arr;
        int left=0, right=matrix[0].length-1;
        int top=0, bottom=matrix.length-1;
        
        while( top<=bottom && left<=right){
           // Left → Right (top row)
           for( int j=left;j<=right;j++){
            arr.add(matrix[top][j]);
           }
           top++;
           // Top → Bottom (right column)
           for( int i=top;i<=bottom;i++){
            arr.add(matrix[i][right]);
           }
           right--;
           // Right → Left (bottom row) (if valid)
           if( top<=bottom){
            for( int j=right;j>=left;j--){
                arr.add(matrix[bottom][j]);
            }
            bottom--;
           }
           // Bottom → Top (left column) (if valid)
           if( left<=right){
            for( int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;
           }
        }
        return arr;
    }
}