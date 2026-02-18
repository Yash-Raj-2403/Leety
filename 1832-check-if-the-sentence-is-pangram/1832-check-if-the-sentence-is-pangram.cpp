class Solution {
public:
    bool checkIfPangram(string sentence) {
        set<char> ul(sentence.begin(),sentence.end());
        int n = ul.size();
        if(n==26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};