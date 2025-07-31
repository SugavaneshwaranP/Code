
    char findTheDifference(char * s, char * t){
    int res = 0;
    while (*s) res ^= *s++;
    while (*t) res ^= *t++;
    return res;
}