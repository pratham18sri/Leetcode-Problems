class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j= s.length()-1;
        boolean palindrom= true;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
               i++; 
               continue;
            } 
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            } 
            if(s.charAt(i)!=s.charAt(j)){
                palindrom= false;
                break;
            }
            i++;
            j--;
        }
        return palindrom;
    }
}