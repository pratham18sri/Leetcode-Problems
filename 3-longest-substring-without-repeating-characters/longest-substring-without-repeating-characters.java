class Solution {
    public int lengthOfLongestSubstring(String s) {
       // first create set
       Set<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int maxlength=0;
        if(s.length()==0) return 0;
        while(j<s.length()){
            // phele set m daal senge characters ager nhi honge
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                // or j ko bada denge 
                j++;
            }
            // nhi to set m se remove kar denge ager koi character repeat hoga to i ko set m se nikla denge or i ko bada denge 
            else{
                set.remove(s.charAt(i));
                i++;
            }
            // fir maxlength calculate kar lenge
            maxlength=Math.max(maxlength,j-i);
        }
        return maxlength;
    }
}