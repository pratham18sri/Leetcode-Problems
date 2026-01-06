class Solution {
    private int next( int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        // map m check kar lenege ager bo number hog to matlab kbhi 1 qayega he nhi bo repet hota rhega 
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=next(n);
        }
        return true;
    }
}