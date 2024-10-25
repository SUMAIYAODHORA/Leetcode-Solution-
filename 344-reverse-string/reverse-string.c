void reverseString(char* s, int size) {
    int i = 0;
    int j = size - 1;
    
    while (i < j) {
        // Swap characters
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
    }
}