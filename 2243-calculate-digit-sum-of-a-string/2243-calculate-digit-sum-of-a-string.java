class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            String temp = "";

            int i = 0;

            while (i < s.length()) {

                int j = Math.min(i + k - 1, s.length() - 1);

                temp += add(s, i, j);

                i = j + 1;
            }

            s = temp;
        }

        return s;
    }

    public static String add(String s, int i, int j) {

        int sum = 0;

        for (int k = i; k <= j; k++) {
            sum += s.charAt(k) - '0';
        }

        return sum + "";
    }
}