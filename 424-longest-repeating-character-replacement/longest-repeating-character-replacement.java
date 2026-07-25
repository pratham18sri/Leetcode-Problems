// class Solution {
//     public int characterReplacement(String s, int k) {
//        int maxcount=0;
//        for( int left=0;left< s.length();left++){
//         int store_k=k;
//         int count= 1;       
//         for(int right=left+1;right<s.length();right++){
//             if( s.charAt(left)==s.charAt(right)){
//                 count++;
//             }else if(store_k>0){
//                 store_k--;
//                 count++;
//             }
//             else{
//                 break;
//             }
//         }
//         maxcount=Math.max(maxcount, count);
//        }
//        return maxcount;
//     }
// }
class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}