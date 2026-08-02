class Solution {
    public String getSmallestString(int n, int k) {
        char result[] = new char[n];
        for(int i = 0 ; i < n ; i++){
            result[i] = 'a';
        }
        int remaining = k - n ;
        int index = n - 1 ;
        while(remaining > 0){
            int addvalue = Math.min(25 , remaining);
            result[index] = (char)(result[index] + addvalue);
            remaining -= addvalue;
            index--;
        }
        return new String(result);
    }
}