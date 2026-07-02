class Solution {
    public boolean detectCapitalUse(String word) {
        int uppcount=0;
        for(int i=0;i< word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) uppcount+=1;
        }
        return (uppcount == word.length() || uppcount == 0 || (uppcount == 1 && Character.isUpperCase(word.charAt(0))));
    }
}