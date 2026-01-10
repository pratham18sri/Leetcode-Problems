class Solution {
    public boolean isPalindrome(int x) {
       char[] digit=String.valueOf(x).toCharArray();
       int i=0;
       int j=digit.length-1;
       boolean ans=true;
       while(i<j){
        if(digit[i]!=digit[j]){
            ans=false;
        }
        i++;
        j--;
       }
       return ans;
    }
}