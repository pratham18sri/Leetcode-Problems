class Solution {
    public String longestCommonPrefix(String[] strs) {
        //  first sort it
        Arrays.sort(strs);
        String first= strs[0];
        String last= strs[strs.length-1];
        String res="";
        int i=0;
        int j=0;
        while( i< first.length() && j< last.length()){
            if(first.charAt(i)==last.charAt(i)){
                res+=first.charAt(i);
                i++;
                j++;
            }else{
                break;
            }
        }
        return res;
    }
}