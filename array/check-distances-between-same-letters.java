class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        for(int i = 0; i < n ;i++){
            char ch = s.charAt(i);
            int h = s.indexOf(ch);
            int j = s.lastIndexOf(ch);
            int dist = j-h-1;
            if(distance[ch-'a'] == dist){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}