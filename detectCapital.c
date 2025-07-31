bool detectCapitalUse(char * word){
    int x=strlen(word);
    if(word[0]>='A'&&word[0]<='Z')
    {
        if(word[1]>='A'&&word[1]<='Z')
        {
            for(int i=2;i<x;i++)
            {
                if(word[i]>='a'&&word[i]<='z')
                return false;
            }
        }
        else
        {
            for(int i=1;i<x;i++)
            {
                if(word[i]>='A'&&word[i]<='Z')
                return false;
            }
        }
    }
    else
    {
        for(int i=0;i<x;i++)
        {
            if(word[i]>='A'&&word[i]<='Z')
            return false;
        }
    }
    return true;
}