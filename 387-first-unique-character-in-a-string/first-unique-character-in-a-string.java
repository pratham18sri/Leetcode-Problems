class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        HashSet<Character> set= new HashSet<>();
        for( char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for( char c: s.toCharArray()){
            if(map.get(c)==1){
                set.add(c);
            }
        }
        for(int i=0;i< s.length();i++){
            if(set.contains(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}