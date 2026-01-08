class Solution {
    private int revAlp(char ch) {
    // ensure lowercase letter
    if (ch < 'a' || ch > 'z') {
        return -1; // invalid input
    }

    return 'z' - ch + 1;
}
    public int reverseDegree(String s) {
        s=s.toLowerCase();
        int sum=0;
        for( int i=0;i<s.length();i++){
            sum+=revAlp(s.charAt(i))*(i+1);
        }
        return sum;
    }
}