class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        // Loop through each character in the string except the last one
        for (int i = 0; i < s.length() - 1; i++) {
            // Calculate the absolute difference between ASCII values of adjacent characters
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }
}
