class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int n=nums.size();
        int fin=0;
        for(int i=0;i<n;i++)
        {
            int key = nums[i];
            int c=2;
            int sum=1+key;
            for(int j=2;j*j<=key;j++)
            {
                if(key%j==0)
                {
                    sum = sum+j;
                    c++;
                    if(j != key/j)
                    {
                        sum += key/j;
                        c++;
                    }
                }
            }
            if(c==4)
            {
                fin += sum;
            }
        }
        return fin;
    }
};