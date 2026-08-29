class Solution {
    public int[] decrypt(int[] code, int k) {

        int result[] = new int[code.length];

        if (k > 0) {

            for (int i = 0; i < code.length; i++) {

                int sum = 0;
                int j = i + 1;
                int cnt = 0;

                while (j < code.length) {
                    sum += code[j];
                    cnt++;
                    j++;

                    if (cnt == k) {
                        break;
                    }
                }

                if (cnt == k) {

                    result[i] = sum;

                } else {

                    int rem = k - cnt;

                    for (int x = 0; x < rem; x++) {
                        sum += code[x];
                    }

                    result[i] = sum;
                }
            }

        } else if (k < 0) {

            int n = Math.abs(k);

            for (int i = 0; i < code.length; i++) {

                int sum = 0;
                int j = i - 1;
                int cnt = 0;

                while (j >= 0) {

                    sum += code[j];
                    cnt++;
                    j--;

                    if (cnt == n) {
                        break;
                    }
                }

                if (cnt == n) {

                    result[i] = sum;

                } else {

                    int rem = n - cnt;

                    for (int x = code.length - 1; x >= code.length - rem; x--) {
                        sum += code[x];
                    }

                    result[i] = sum;
                }
            }

        } else {

            for (int i = 0; i < code.length; i++) {
                result[i] = 0;
            }
        }

        return result;
    }
}