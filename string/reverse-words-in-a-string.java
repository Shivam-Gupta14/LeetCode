class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int st = 0;
        int en = words.length - 1 ;
        while(st < en){
            String temp = words[st];
            words[st] = words[en];
            words[en] = temp;

            st++;
            en--;
        }
        return String.join(" ", words);
    }
}