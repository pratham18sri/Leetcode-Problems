class Solution {
    public String minWindow(String s,String t){
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0,count=0,minlen=Integer.MAX_VALUE,start=0;
        for(int right=0;right<s.length();right++){
            if(freq[s.charAt(right)]>0){
                count++;
            }
            freq[s.charAt(right)]--;
            while(count==t.length()){
                int diff=right-left+1;
                if(diff<minlen){
                    minlen=diff;
                    start=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count--;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}