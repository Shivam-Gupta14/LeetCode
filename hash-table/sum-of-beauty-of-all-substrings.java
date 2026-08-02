class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int j = i ; j < n ; j++){
            int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
            char c = s.charAt(j);
            hm.put(c , hm.getOrDefault(c,0)+1);
            for(int v : hm.values()){
                max = Math.max(max , v);
                min = Math.min(min , v);
            }
            sum += max - min;
        }
        }
        return sum;
    }
}