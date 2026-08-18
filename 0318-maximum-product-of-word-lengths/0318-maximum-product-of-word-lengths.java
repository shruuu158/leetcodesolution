class Solution {
    public int maxProduct(String[] words) {

        int max = 0;

        for (int i = 0; i < words.length; i++) {

            boolean[] seen = new boolean[26];

            // Store characters of first word
            for (char ch : words[i].toCharArray()) {
                seen[ch - 'a'] = true;
            }

            for (int j = i + 1; j < words.length; j++) {

                boolean common = false;

                // Check second word
                for (char ch : words[j].toCharArray()) {

                    if (seen[ch - 'a']) {
                        common = true;
                        break;
                    }
                }

                // No common character
                if (!common) {
                    int product = words[i].length() * words[j].length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }
}