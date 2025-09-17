// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Diamond {
    public static void main(String[] args) {
    
    int n = 5;
    pattern(n);
    }
    
    
    static void pattern(int n)
    {
        for(int row = 0;row < 2*n ;row++)
        {
            int tcol = row > n ? 2*n - row : row;
            
            int space = n - tcol;
            
            for(int s = 0;s<space;s++)
            {
                System.out.print(" ");
            }
            for(int col = 0;col<tcol;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}