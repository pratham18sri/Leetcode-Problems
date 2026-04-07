class Solution {
    private String build(String str){
        StringBuilder st=new StringBuilder();
        for( char i:str.toCharArray()){
            if(i !='#'){
                st.append(i);
            }
            else{
                if(st.length()>0) st.deleteCharAt(st.length()-1);
            }
        }
        return st.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}