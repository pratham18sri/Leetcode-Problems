class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        int j=0;
        String ans="";
        while(i<first.length() && j<last.length()){
            if(first.charAt(i)==last.charAt(j)){
            ans+=first.charAt(i);
            i++;
            j++;  
            }
            else{
                break;
            }
        }
        return ans;
    }
}