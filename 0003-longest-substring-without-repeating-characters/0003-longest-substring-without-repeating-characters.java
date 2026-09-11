class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;
        int i = 0;
        int j = 0;

        while(j < s.length()) {

            if(!set.contains(s.charAt(j))) {

                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, set.size());
                j++;

            } else {

                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
}