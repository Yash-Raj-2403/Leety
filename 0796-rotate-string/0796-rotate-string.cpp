class Solution {
public:
    bool rotateString(string s, string goal) {
        string fin = s+s;
        if(s.size() != goal.size())
        {
            return false;
        }
        if(fin.find(goal) != string::npos)
        {
            return true;
        }
        return false;
    }
};