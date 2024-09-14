class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count the occurrences of each character
        int[] count = new int[26]; // 26 for lowercase English letters

        // Loop through both strings
        for (int i = 0; i < s.length(); i++) {
            // Increment count for characters in s
            count[s.charAt(i) - 'a']++;
            // Decrement count for characters in t
            count[t.charAt(i) - 'a']--;
        }

        // If any count is not zero, they are not anagrams
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        // They are anagrams
        return true;
    }
}
