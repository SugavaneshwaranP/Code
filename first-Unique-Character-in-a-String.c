    int firstUniqChar(char* s) {
    int alphaTable[26] = {0};
    int size = strlen(s);
    int i;
    
    for (i = 0; i < size; i++){
        alphaTable[s[i] - 'a']++;
    }
    for (i = 0; i < size; i++) {
        if (alphaTable[s[i] - 'a'] == 1) return i; 
    }
    return -1;
}