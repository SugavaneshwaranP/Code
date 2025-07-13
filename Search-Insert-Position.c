int searchInsert(int arr[], int n, int K)
{
    
    for (int i = 0; i < n; i++)
        
        if (arr[i] == K)
            return i;
        
        else if (arr[i] > K)
            return i;
    
    return n;
}