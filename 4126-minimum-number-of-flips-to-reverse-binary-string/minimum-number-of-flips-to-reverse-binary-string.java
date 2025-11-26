class Solution {
    public int minimumFlips(int n) {
        // Step 1: Convert n to binary string
        String bin = Integer.toBinaryString(n); 
        
        // Step 2: Convert to array
        int[] arr = bin.chars().map(c -> c - '0').toArray();
        
        // Step 3: Reverse array properly
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        
        // Step 4: Count flips
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) count++;
        }
        
        return count;
    }
}
