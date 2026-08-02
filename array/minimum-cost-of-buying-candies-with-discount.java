class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0 ;
        //int min = Integer.MIN_VALUE;
          Arrays.sort(cost);
         for (int i = 0; i < cost.length / 2; i++) {
            int temp = cost[i];
            cost[i] = cost[cost.length - 1 - i];
            cost[cost.length - 1 - i] = temp;
        }

        for(int i = 0 ; i < cost.length ; i++){
            if(i % 3 != 2){
                sum += cost[i];
            }
        }
        return sum;
    }
}