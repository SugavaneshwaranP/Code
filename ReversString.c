void reverseString(char* s, int sSize) {
    int l=0;
    int end=sSize-1;
   for(l = 0;l<=end;l++)
   {
    char t = s[l];
    s[l] = s[end];
    s[end] = t;
    end--;
   }
}