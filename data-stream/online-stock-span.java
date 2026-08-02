class StockSpanner {
private Stack<int[]> Stack;
    public StockSpanner() {
        Stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!Stack.isEmpty() && Stack.peek()[0] <= price){
            span += Stack.pop()[1];
        }
        Stack.push(new int[]{price,span});
    
    return span;
}
}
