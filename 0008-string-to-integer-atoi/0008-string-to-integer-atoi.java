class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int num = 0;
        int sign = 1;

        // whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // signedness
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            }
        }

        // conversion
        while (i < s.length() &&
               s.charAt(i) >= '0' &&
               s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && digit > 7)) {

                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}