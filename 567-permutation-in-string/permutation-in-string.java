class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        // s1 ko sort kar denge 
        char chr[]=s1.toCharArray();
        Arrays.sort(chr);
        String s1_sort=new String(chr);
        //window bnayenge jiski length hogi s1 ki lenght k according or fir us window ko sort karenge or check karte jayege ki bo s1_sort k equal hai ki nhi
        int k=s1_sort.length();
        //first window
        String curr="";
        for( int i=0;i<k;i++){
            curr+=s2.charAt(i);
        }
        //chek karenge
        char c[]=curr.toCharArray();
        Arrays.sort(c);
        String s2_sort=new String(c);

        if(s1_sort.equals(s2_sort)){
            return true;
        }
        // update window
        for( int i=k;i<s2.length();i++){
            curr+=s2.charAt(i);          //add
            curr=curr.substring(1);      // remove
            //sort karenge current window ko 
            char temp[]=curr.toCharArray();
            Arrays.sort(temp);
            String sorted=new String(temp);
            if(s1_sort.equals(sorted)) return true;
        }
        return false;
    }
}