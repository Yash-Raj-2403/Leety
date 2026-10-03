class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mp = new TreeMap<>();
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }
        List<String> lst = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            int maxa = Collections.max(mp.values());
            for(String x:mp.keySet()){
                if(mp.get(x) == maxa){
                    lst.add(x);
                    mp.put(x,0);
                    break;
                }
            }
        }
        return lst;
    }
}