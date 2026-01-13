class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        double maxdiognal=0;
        int maxarea=0;
        for( int i=0;i< dim.length;i++){
            int length=dim[i][0];
            int breadth=dim[i][1];
            double diognal=Math.sqrt(length*length+breadth*breadth);
            if( diognal> maxdiognal){
                maxdiognal=diognal;
                maxarea=length*breadth;
            }
            else if( diognal==maxdiognal){
                maxarea=Math.max(maxarea,length*breadth);
            }
        }
        return maxarea;
        

    }
}