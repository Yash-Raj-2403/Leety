class Solution {
public:
    string frequencySort(string s) {
        int n = s.size();
        vector<pair<int,char>> freq(128,{0,0});
        for(int i=0;i<n;i++)
        {
            freq[s[i]].first++;
            freq[s[i]].second=s[i];
        }
        string ans="";
        sort(freq.begin(),freq.end(),greater<>());
        for(int i=0;i<128;i++)
        {
            while(freq[i].first >0)
            {
                ans += freq[i].second; 
                freq[i].first--;
            }
        }
        return ans;
    }
};