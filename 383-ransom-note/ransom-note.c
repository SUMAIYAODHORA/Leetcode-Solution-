bool canConstruct(char* ransomNote, char* magazine) {
    int lettercount[26]={0};
    
    // Populate letter counts for magazine
    while (*magazine) {
        lettercount[*magazine - 'a']++;
        magazine++;
    }
    
    // Check if each letter in ransomNote can be found in magazine
    while (*ransomNote) {
        if (lettercount[*ransomNote - 'a'] == 0) {
            return false;  // Not enough of this letter
        }
        lettercount[*ransomNote - 'a']--;  // Use one instance of this letter
        ransomNote++;
    }
    
    return true;
}
