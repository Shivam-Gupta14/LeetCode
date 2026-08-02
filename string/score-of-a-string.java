class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int n = s.length();
        for(int i = 0 ; i  <n-1 ; i++ ){
            int ascii = (int)s.charAt(i);
            int ascii2 = (int)s.charAt(i+1);
            score += Math.abs(ascii - ascii2);
        }
        return score;
    }
}