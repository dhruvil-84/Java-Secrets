class Break
{
    public static void main(String[] args)
    {
        // break in for loop.
        for(int i = 0; i < 7; i++)
        {
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // break in nested for loop.
        for(int i = 0; i < 5; i++)
        {
            System.out.print("pass " + i + " : ");
            for(int j = 0; j < 10; j++)
            {
                if(j == 5) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // break as goto in labelled blocks.
        first: {
            second: {
                third: {
                        System.out.println("Inside third block, Before Break;"); 
                        break second; // breaks out from the second block.
                        // System.out.println("This won't execute.");
                }
                // System.out.println("Inside second block, outside third block.");
            }
            System.out.println("Inside first block, outside second block.");
        }
        System.out.println("outside all blocks");

        // break as goto in labelled loops.
        outer: for(int i = 0; i < 5; i++)
        {
            System.out.print("pass " + i + " : ");
            for(int j = 0; j < 10; j++)
            {
                if(j == 5) break outer; // exits both loops.
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("All Loops completed");
    }
}
