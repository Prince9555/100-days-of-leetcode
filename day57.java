 class Solution {
    public int[] countBits(int n) {
        int[] resultArray = new int[n + 1];        

        for (int i = 0; i <= n; i++) {
            resultArray[i] = resultArray[i >> 1] + i % 2;
        }

        return resultArray;        
    }
}