class Solution {
    public int numDifferentIntegers(String word) {

        int i = 0;
        String num = "";
        boolean found = false;

        HashSet<String> set = new HashSet<>();

        while (i < word.length()) {

            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {

                found = true;
                num += word.charAt(i);

            } else {

                if (found) {
                    found = false;
                    
                    set.add(removeZeros(num));
                    num = "";
                }
            }

            i++;
        }

        if (found) {
            set.add(removeZeros(num));
        }

        return set.size();
    }
    public String removeZeros(String num) {

        int i = 0;

        while (i < num.length() - 1 && num.charAt(i) == '0') {
            i++;
        }

        return num.substring(i);
    }
}