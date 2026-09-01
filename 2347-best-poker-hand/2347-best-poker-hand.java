class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        HashMap<Character, Integer> flush = new HashMap<>();
        HashMap<Integer, Integer> rank = new HashMap<>();

        for (int i = 0; i < suits.length; i++) {
            flush.put(suits[i], flush.getOrDefault(suits[i], 0) + 1);
        }

        for (char ch : flush.keySet()) {
            if (flush.get(ch) == 5) {
                return "Flush";
            }
        }

        for (int i = 0; i < ranks.length; i++) {
            rank.put(ranks[i], rank.getOrDefault(ranks[i], 0) + 1);
        }

        for (int n : rank.keySet()) {
            if (rank.get(n) >= 3) {
                return "Three of a Kind";
            }
        }

        for (int n : rank.keySet()) {
            if (rank.get(n) == 2) {
                return "Pair";
            }
        }

        return "High Card";
    }
}