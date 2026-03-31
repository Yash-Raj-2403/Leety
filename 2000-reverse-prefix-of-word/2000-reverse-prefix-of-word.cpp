class Solution {
public:
    string reversePrefix(string word, char ch) {
        int n = word.size();
        int store=0;
        for(int i=0;i<n;i++)
        {
            if(word[i] == ch)
            {
                store = i;
                break;
            }
        }
        reverse(word.begin(),word.begin()+store+1);
        return word;
    }
};