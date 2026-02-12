class Solution {
public:
   bool isPowerOfTwo(int N) {
    return N > 0 && (N & (N - 1)) == 0;
}
};