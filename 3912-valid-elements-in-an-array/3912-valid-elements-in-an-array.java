class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (leftMax(i, nums) || rightMax(i, nums)) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static boolean leftMax(int i, int[] nums) {
        for (int j = i - 1; j >= 0; j--) {
            if (nums[i] <= nums[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rightMax(int i, int[] nums) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] <= nums[j]) {
                return false;
            }
        }
        return true;
    }
}