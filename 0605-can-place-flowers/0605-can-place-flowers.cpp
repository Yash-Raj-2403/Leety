class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int f = flowerbed.size();
        int k=0;
        if(f == 1)
        {
            if(flowerbed[0] == 0) k++;
        }
        else if(flowerbed[0] == 0 && flowerbed[1] == 0)
        {
            flowerbed[0] = 1;
            k++;
        }
        for(int i=1;i<f-1;i++)
        {
            if(flowerbed[i-1] ==0 && flowerbed[i] == 0 && flowerbed[i+1] == 0)
            {
                flowerbed[i] = 1;
                k++;
            }
        }
        if(f > 1 && flowerbed[f-1] == 0 && flowerbed[f-2] == 0)
        {
            k++;
        }
        if(k>=n)
        {
            return true;
        }
        return false;
    }
};