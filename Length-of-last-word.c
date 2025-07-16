int lengthOfLastWord(char* s) {
    int i, count = 0;
    if(strlen(s) == 1) return 1;
    for(i = strlen(s) - 1;i>=0;i-=1){
        if(s[i] != ' ')count +=1;
        if(s[i]!= ' ' && i > 0
         && s[i-1] == ' ') break;
    }
    return count;

}