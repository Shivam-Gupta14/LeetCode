class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // bring last element forward
                n--;                    // shrink array size
            } else {
                i++;
            }
        }

        return n;
    }
}
