class Solution {
    public int trap(int[] height) {
        int h = height.length;
        Stack<Integer> s = new Stack<>();
        int trapwater = 0;
        for(int i = 0 ; i<h;i++){
        while(!s.isEmpty() && height[i] > height[s.peek()]){
            int top = s.pop();
        
        if(s.isEmpty()){
            break;
        }
        int width = i - s.peek() - 1;
        int bheight = Math.min(height[i] , height[s.peek()]) - height[top];
        trapwater += width*bheight;
        }
        s.push(i);
        }
        return trapwater;
    }
}