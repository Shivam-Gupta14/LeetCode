class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l1 = g.length;
        int l2 = s.length;
        int i = 0;
        int j = 0;
        while(i < l1 && j < l2){
            if(s[j] >= g[i]){
                i++;
                j++;
            }
            else{
                
                j++;
            }
        }
        return i;

    }
}