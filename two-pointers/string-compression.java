class Solution {
    public int compress(char[] chars) {
        int id = 0;
        for(int i = 0 ; i < chars.length ;){
            char ch = chars[i];
            int count = 0;
            while(i < chars.length && ch == chars[i]){
                count++;
                i++;
            }
            if(count == 1){
                chars[id++] = ch; 
            }
            else{
                chars[id++] = ch;
                String str = Integer.toString(count);
                for(char dig : str.toCharArray()){
                    chars[id++] = dig;
                }
            }
        }
        return id;
    }
}