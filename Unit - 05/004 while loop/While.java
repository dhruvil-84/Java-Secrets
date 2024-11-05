class While
{
    public static void main(String[] args)
    {
        // Scene 1. (Normal while loop)
        int a = 10;
        while (a-- > 0)
            System.out.println("tick tick " + a);

/*
        // Scene 2. (while condition is false)
        while(9 > 10)
            System.out.println("This will not be executed.");
*/

        // Scene 3. (while loop body is empty) // this type of scene  is mostly used in OS for scheduling algorithms.
        int i = 100, j = 200;
        while(++i < --j);
        System.out.println("Midpoint is: " + i);

        // Scene 4. (nested while loop)
        int x = 0;
        while(x < 5)
        {
            int y = 0;
            while(y < 3)
            {
                System.out.println("x = " + x + " y = " + y);
                y++;
            }
            x++;
        }

/*
        // Scene 5. (Infinite While loop)
        while(true)
        {
            System.out.println("This is infinite while loop.");
        }
*/
    }
}
