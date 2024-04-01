class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Concatenate strings from word1 array
        String concatenated1 = "";
        for (int i = 0; i < word1.length; i++) {
            concatenated1 += word1[i];
        }

        String concatenated2 = "";
        for (int j = 0; j < word2.length; j++) {
            concatenated2 += word2[j];
        }
         // Compare the concatenated strings
        return concatenated1.equals(concatenated2);
    }
}