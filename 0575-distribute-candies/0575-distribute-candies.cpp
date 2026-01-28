class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        int ab = candyType.size();
        set<int> uq(candyType.begin(),candyType.end());
        int num = uq.size();
        int c = ab/2;
        return min(num,c);
    }
};