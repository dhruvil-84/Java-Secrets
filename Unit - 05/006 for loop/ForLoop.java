class ForLoop
{
    public static void main(String[] args)
    {
        // Scene 1. (Normal for loop)
        for (int a = 10; a > 0; a--)
            System.out.println("tick tick " + a);

/*
        // Scene 2. (for condition is false)
        for( ; 9 > 10; )
            System.out.println("This will not be executed.");
*/

        // Scene 3. (for loop body is empty and control variables are comma seperated) // this type of scene is mostly used in OS for scheduling algorithms.
        int i, j;
        for (i = 100, j = 200; i < j; i++, j--);
        System.out.println("Midpoint is: " + i);

        // Scene 4. (nested for loop)
        for(int x = 0; x < 5; x++) for(int y = 0; y < 3; y++) System.out.println("x = " + x + " y = " + y);

/*
        // Scene 5. (Infinite for loop)
        for( ; ; )
        {
            System.out.println("This is infinite for loop.");
        }
*/
    }
}
