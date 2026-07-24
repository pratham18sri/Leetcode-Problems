class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //  store in hash map string and uski anagram in list
        HashMap<String, List<String>> map= new HashMap<>();
        for( String s: strs){
            // conver word  to array than sort it to check anangram
            char ch[]= s.toCharArray();
            Arrays.sort(ch);
            // store that word to check they anagram 
            String key= new String(ch);
            // method in map PutIf absent for single word
            map.putIfAbsent(key, new ArrayList<>());
            //  method for anagram word
            map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
    }
}