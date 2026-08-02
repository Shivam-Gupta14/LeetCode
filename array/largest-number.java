class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        // Manual bubble sort based on custom string comparison
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String ij = String.valueOf(nums[j]) + String.valueOf(nums[j + 1]);
                String ji = String.valueOf(nums[j + 1]) + String.valueOf(nums[j]);

                if (ij.compareTo(ji) < 0) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Edge case: if the largest number is 0 (e.g. [0, 0, 0]), return "0"
        if (nums[0] == 0) return "0";

        // Build the final string
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }
}