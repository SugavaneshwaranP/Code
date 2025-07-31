char ** fizzBuzz(int n, int* returnSize){
    char ** result = (char **)malloc(10000*sizeof(char *));
    *returnSize = n;
    for(int i=1; i<=n; i++)
    {
        result[i-1] = (char *)malloc(9*sizeof(char));
        if((i%3 == 0) && (i%5 == 0))
            result[i-1] = "FizzBuzz";
        else if(i%3 == 0)
             result[i-1] = "Fizz";
        else if(i%5 == 0)
             result[i-1] = "Buzz";
        else  sprintf(result[i-1], "%d", i);
            
    }
    return result;
}