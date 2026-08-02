class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int pairs = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'L'){
                balance++;
            }
            else if(s.charAt(i) == 'R'){
                balance--;
            }
            if(balance == 0){
            pairs++;
        }
        }
        return pairs;
    }
}