class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> ansRows = new ArrayList<>();
            ansRows.add(1);
            long res = 1;
            for(int col = 1 ; col <= i ; col++){
                res = res * (i - col + 1);
                res = res/col;
                ansRows.add((int)res);
            }
            ans.add(ansRows);
        }
        return ans;
    }
}