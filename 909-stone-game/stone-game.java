class Solution {
    public boolean stoneGame(int[] piles) {
        int size=piles.length;
        int sum = Arrays.stream(piles).sum();
        int a=(piles[0]+piles[1])-sum;
        int b=(piles[size-1]+piles[size-2])-sum;
        return true;
    }
}