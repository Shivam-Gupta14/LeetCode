class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String newstr = "";
       for(int i = 0; i<n;i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            newstr += s.charAt(i);
        }
       }
       newstr = newstr.toLowerCase();
        for(int i = 0; i< newstr.length()/2;i++){
            if(newstr.charAt(i) != newstr.charAt(newstr.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}