class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Character> lst = new ArrayList<>(mp.keySet());
        Collections.sort(lst,(a,b)->{
            return Integer.compare(mp.get(b),mp.get(a));
        });
        StringBuilder ans = new StringBuilder();
        for(char c:lst){
            while(mp.get(c)>0){
                ans.append(c);
                mp.put(c,mp.get(c)-1);
            }
        }
        return ans.toString();
    }
}