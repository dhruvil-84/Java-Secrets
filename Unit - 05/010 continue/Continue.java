class Continue
{
    public static void main(String[] args)
    {
        // continue in for loop.
        for(int i = 0; i < 7; i++)
        {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // continue in nested for loop.
        for(int i = 0; i < 5; i++)
        {
            System.out.print("pass " + i + " : ");
            for(int j = 0; j < 10; j++)
            {
                if(j == 5) continue;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // continue as goto in labelled blocks is not possible bcoz it works in loops only.

        // continue as goto in labelled loops.
        outer: for(int i = 0; i < 5; i++)
        {
            System.out.print("pass " + i + " : ");
            for(int j = 0; j < 10; j++)
            {
                if(j == 5) continue outer; // jumps to loop for next iteration.
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("All Loops completed");
    }
}
