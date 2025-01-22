bool areOccurrencesEqual(char* s) {
    int freq[26] = {0};

    for(int i = 0; s[i] != '\0'; i++) {
        freq[s[i] - 'a']++;
    }
    int prev = freq[s[0] - 'a'];
    for(int i = 0;i < 26; i++) {
        if(freq[i] == 0) continue;
        if(prev != freq[i]) return false;
    }

    return true;
}