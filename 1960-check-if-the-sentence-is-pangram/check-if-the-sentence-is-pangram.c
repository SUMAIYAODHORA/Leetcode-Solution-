bool checkIfPangram(char* sentence) {
   
    bool alphabet[26] = {false};

  
    for (int i = 0; sentence[i] != '\0'; i++) {
        char ch = sentence[i];

        
        ch = tolower(ch);

      
        if (ch >= 'a' && ch <= 'z') {
            int index = ch - 'a'; 
            alphabet[index] = true; 
        }
    }

    
    for (int i = 0; i < 26; i++) {
        if (!alphabet[i]) {
            return false; 
        }
    }
    return true; 
}