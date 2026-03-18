class Solution {
public:
    int vowelConsonantScore(string s) {
        int n = s.size();
        int vow=0,con=0;
        for(int i=0;i<n;i++)
        {
            if(isalpha(s[i]))
            {
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
            {
                vow++;
            }
            else
            {
                con++;
            }
            }
        }
        if(con==0 || vow==0) return 0;
        return vow/con;
    }
};