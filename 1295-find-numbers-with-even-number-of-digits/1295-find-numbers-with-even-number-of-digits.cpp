class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int n = nums.size();
        int fin=0,k=0;
        for(int i=0;i<n;i++)
        {
            k=0;
            int key = nums[i];
            while(key!=0)
            {
                int all = key%10;
                k++;
                key/=10;
            }
            if(k%2==0)
            {
                fin++;
            }
        }
        return fin;
    }
};