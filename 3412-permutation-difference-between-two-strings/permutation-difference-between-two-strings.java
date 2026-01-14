class Solution {
    public int findPermutationDifference(String s, String t) {
       int i=0;
       int j=0;
       int sum=0;
       while( i < s.length() && j<t.length()){
        while(s.charAt(i)!=t.charAt(j)){
            j++;
        }
        if(s.charAt(i)==t.charAt(j)){
            sum+=Math.abs(j-i);
        }
        i++;
        j=0;
    }
    return sum;
    }
}