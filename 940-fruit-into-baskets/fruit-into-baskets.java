class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i= 0;
        int j= 0;
        int max = 0;
        while (j<fruits.length) {
            map.put(fruits[j] ,map.getOrDefault(fruits[j], 0)+1);
            // ager 2 se jyada tyoe k fruits aa gye hai to dhrink kar do windo ko yahi first key ko nikal do
            while (map.size()> 2) {
                map.put(fruits[i],map.get(fruits[i])-1);
                if (map.get(fruits[i])==0) {
                    map.remove(fruits[i]);
                }
                i++;
            }

            // Update max length
            max=Math.max(max, j-i+1);

            j++;
        }

        return max;
    }
}
