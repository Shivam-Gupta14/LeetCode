class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer > hm = new HashMap<>();
        for(char c : s.toCharArray()){
         hm.put(c , hm.getOrDefault(c,0)+1);
        }
        List<Character> li = new ArrayList<>(hm.keySet());
        
        Collections.sort(li ,(a,b) -> hm.get(b)-hm.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c : li){
            int freq = hm.get(c);
            for(int i = 0 ; i < freq ; i++){
            sb.append(c);
        }
        }
        return sb.toString();
    }
}