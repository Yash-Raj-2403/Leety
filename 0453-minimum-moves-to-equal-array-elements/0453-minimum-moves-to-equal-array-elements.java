class Solution {
    public int minMoves(int[] nums) {
        int mina = Integer.MAX_VALUE;
        for(int x:nums){
            mina = Math.min(mina,x);
        }
        int sum =0;
        for(int x:nums){
            sum += (x-mina);
        }
        return sum;
    }
}