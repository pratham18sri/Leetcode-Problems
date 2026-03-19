class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int len=0;
        int maxlen=0;
        int left=0;
        for( int right=0;right<s.length();right++){
            //ager set m new right already hai to left se kam kar to lenght ko or set se nikal do right ko
            while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
            }
            //right ko badate jao jabtak dublicate nhi ata
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}