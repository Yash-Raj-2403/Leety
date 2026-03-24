class Solution {
public:
    double average(vector<int>& salary) {
        int mina = *(min_element(salary.begin(),salary.end()));
        int maxa = *(max_element(salary.begin(),salary.end()));
        double sum=0;
        int n = salary.size()-2;
        for(int i=0;i<salary.size();i++)
        {
            if(salary[i]!=mina && salary[i] != maxa)
            {
                sum +=salary[i];
            }
        }
        return sum/n;
    }
};