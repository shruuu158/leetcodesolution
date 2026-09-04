class Solution {

    public String modifyString(String s) {

        if (s.length() == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            }
            return s;
        }

        String result = "";

        // First character
        if (s.charAt(0) == '?') {

            for (char i = 'a'; i <= 'z'; i++) {

                if (s.charAt(1) != i) {
                    result += i;
                    break;
                }
            }

        } else {
            result += s.charAt(0);
        }

        // Middle characters
        for (int i = 1; i < s.length() - 1; i++) {

            if (s.charAt(i) == '?') {

                for (char j = 'a'; j <= 'z'; j++) {

                    if (result.charAt(result.length() - 1) != j &&
                        s.charAt(i + 1) != j) {

                        result += j;
                        break;
                    }
                }

            } else {
                result += s.charAt(i);
            }
        }

        // Last character
        if (s.charAt(s.length() - 1) == '?') {

            for (char i = 'a'; i <= 'z'; i++) {

                if (result.charAt(result.length() - 1) != i) {
                    result += i;
                    break;
                }
            }

        } else {
            result += s.charAt(s.length() - 1);
        }

        return result;
    }
}