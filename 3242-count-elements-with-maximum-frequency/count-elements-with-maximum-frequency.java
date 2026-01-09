class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for( int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //put new array m daal denge
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:map.values()){
            arr.add(i);
        }
        Collections.sort(arr);
        int max=arr.get((arr.size()-1));
        int sum=0;
        for( int i=0;i<arr.size();i++){
            if(arr.get(i)==max){
                sum+=arr.get(i);
            }
        }
        return sum;
    }
}