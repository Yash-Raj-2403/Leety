class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> f1(26,0);
        vector<int> f2(26,0);
        int n1 = ransomNote.size();
        int n2 = magazine.size();
        if(n1 > n2)
        {
            return false;
        }
        for(int i=0;i<n1;i++)
        {
            f1[ransomNote[i]-'a']++;
        }
        for(int i=0;i<n2;i++)
        {
            f2[magazine[i]-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(f1[i] > f2[i])
            {
                return false;
            }
        }
        return true;
    }
};