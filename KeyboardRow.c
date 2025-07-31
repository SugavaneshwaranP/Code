
char** findWords(char** words, int wordsSize, int* returnSize)
{
    char **match = (char **)malloc(sizeof(char *) * wordsSize);
    if(!match)
        return NULL; 
    int index = 0;
    bool sameLine = true;
    int lut[26] = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
    for (int i=0; i<wordsSize; i++)
    {
        sameLine = true;
        for (int j=0; j<strlen(words[i]) - 1; j++)
        {
            if (lut[(words[i][j] - 'A')%32] != lut[(words[i][j+1] - 'A')%32]){
                sameLine = false;
                break;
            }
        }
        if (sameLine){
            match[index] = words[i];
            index++;
        }
    }
    *returnSize = index;
    return match;
}