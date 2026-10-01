class Solution {
    int isprime(int n){
        if(n<2) return 0;
        boolean[] p = new boolean[n];
        Arrays.fill(p,true);
        p[0] = p[1] = false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(p[i] ==  true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    p[j] = false;
                }
            }
        } 
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(p[i]) c++;
        }
        return c;
    }
    public int countPrimes(int n) {
        return isprime(n);
    }
}