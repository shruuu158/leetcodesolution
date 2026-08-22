class Solution {
    public int findKthPositive(int[] arr, int k) {

        int count = 0;

        for (int i = 1; ; i++) {

            if (!contains(arr, i)) {
                count++;

                if (count == k) {
                    return i;
                }
            }
        }
    }

    public boolean contains(int[] arr, int num) {

        for (int x : arr) {
            if (x == num) {
                return true;
            }
        }

        return false;
    }
}