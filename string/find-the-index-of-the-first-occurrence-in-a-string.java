class Solution {
    public int strStr(String haystack, String needle) {
        int hay = haystack.length();
        int need = needle.length();
        if(haystack.isEmpty() ){
            return 0;
        }
        
        for(int i = 0 ; i <= hay - need ; i++){
            if(haystack.substring(i , i + need).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}