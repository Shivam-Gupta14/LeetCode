class Solution {
    public String removeOuterParentheses(String s) {
        int cmt =0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
             if(s.charAt(i) == ')'){
                cmt--;

            }
            
            if(cmt != 0 ){
            sb.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                cmt++;
            }
            
        }
        return sb.toString();
    }
}