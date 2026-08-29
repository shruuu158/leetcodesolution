class Solution {
    public int firstStableIndex(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int max = findmax(nums, i);
            int min = findmin(nums, i);

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }

    public static int findmin(int num[], int i) {
        int low = Integer.MAX_VALUE;

        for (int j = i; j < num.length; j++) {
            if (num[j] < low) {
                low = num[j];
            }
        }

        return low;
    }

    public static int findmax(int num[], int i) {
        int high = Integer.MIN_VALUE;

        for (int j = i; j >= 0; j--) {
            if (num[j] > high) {
                high = num[j];
            }
        }

        return high;
    }
}