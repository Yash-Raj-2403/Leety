class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sr = source[0];
        int sc = source[1];
        int tr = target[0];
        int tc = target[1];
        if(sr == tr  && tc == sc) return 0;
        if(sr == tr || tc == sc) return 1;
        if(Math.abs(sr-tr) == Math.abs(tc-sc)) return 1;
        return 2;
    }
}