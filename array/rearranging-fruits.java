import java.util.*;

public class Solution {

    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> count = new HashMap<>();
        int n = basket1.length;
        long res = 0;

        for (int fruit : basket1)
            count.put(fruit, count.getOrDefault(fruit, 0) + 1);

        for (int fruit : basket2)
            count.put(fruit, count.getOrDefault(fruit, 0) - 1);

        List<Integer> swaps = new ArrayList<>();
        int minFruit = Integer.MAX_VALUE;

        for (int key : count.keySet()) {
            int c = count.get(key);
            minFruit = Math.min(minFruit, key);

            if (c % 2 != 0) return -1;

            for (int i = 0; i < Math.abs(c) / 2; i++) {
                swaps.add(key);
            }
        }

        Collections.sort(swaps);
        int size = swaps.size() / 2;

        for (int i = 0; i < size; i++) {
            res += Math.min(swaps.get(i), 2 * minFruit);
        }

        return res;
    }
}
