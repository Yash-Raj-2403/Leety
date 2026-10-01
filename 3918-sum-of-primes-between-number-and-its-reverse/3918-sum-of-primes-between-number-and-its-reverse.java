class Solution {
    int sieve(int left, int right){
        boolean[] p = new boolean[1001];
        Arrays.fill(p,true);
        p[0] = p[1] = false;
        int sum=0;
        for(int i=2;i<1001;i++)
        {
            if(p[i] == true)
            {
                for(int j=i*i;j<1001;j+=i)
                {
                    p[j] = false;
                }
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(p[i]) sum+=i;
        }
        return sum;
    }
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int ori = n;
        while(n>0)
        {
            int lt = n%10;
            rev = rev*10 +lt;
            n/=10;
        }
        int mina = Math.min(ori,rev);
        int maxa = Math.max(ori,rev);
        return sieve(mina,maxa);
    }
}