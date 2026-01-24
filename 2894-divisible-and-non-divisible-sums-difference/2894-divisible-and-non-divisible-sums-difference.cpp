class Solution {
public:
    int differenceOfSums(int n, int m) {
        int sumo=0,sume=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                sume = sume + i;
            }
            else
            {
                sumo = sumo + i;
            }
        }
        return sumo-sume;
    }
};