class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nextgreater = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i < n;i++){
            nextgreater[i] = -1;
        }
        for(int i = 2*n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i%n]){
                s.pop();
            }
            if(i<n){
                if(!s.isEmpty()){
                    nextgreater[i] = nums[s.peek()];
                }
            }
            s.push(i%n);
        }
        return nextgreater;

}
}