class Solution {

    public void sortIt(Long arr[]) {
        ArrayList<Long> al = new ArrayList<>();
        ArrayList<Long> al1 = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                al.add(arr[i]);
            }
            
            else{
                al1.add(arr[i]);
            }
        }
        
    Collections.sort(al);
    al1.sort(Collections.reverseOrder());
    al1.addAll(al);
    for(int i = 0;i<arr.length;i++)
    {
        arr[i] = al1.get(i);
    }
        
    }
}