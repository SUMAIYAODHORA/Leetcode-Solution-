bool detectCapitalUse(char* word) {
    int upperCount = 0;

    // Count the uppercase letters in the word
    for (int i = 0; word[i] != '\0'; i++) {
        if (isupper(word[i])) upperCount++;
    }

    // Check the combined condition
    return upperCount == 0 ||                  // All lowercase
           upperCount == strlen(word) ||       // All uppercase
           (isupper(word[0]) && upperCount == 1); // Only the first letter is uppercase
}