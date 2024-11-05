import java.util.Scanner;

class DoWhile
{
    public static void main(String[] args)
    {
        // Scene 1. (Normal Dowhile loop)
        int a = 10;
        do
        {
            System.out.println("tick tick " + a);
        } while (a-- > 0);

/*
        // Scene 2. (Dowhile condition is false)
        do 
        {
            System.out.println("This will be executed once.");
        } while(9 > 10);
*/

        // Scene 3. (Dowhile loop body is empty) // this type of scene  is mostly used in OS for scheduling algorithms.
        int i = 100, j = 200;
        do
        {
        } while(++i < --j);
        System.out.println("Midpoint is: " + i);

        // Scene 4. (nested Dowhile loop)
        int x = 0;
        do
        {
            int y = 0;
            do
            {
                System.out.println("x = " + x + " y = " + y);
                y++;
            } while(y < 3);
            x++;
        } while(x < 5);

/*
        // Scene 5. (Infinite DoWhile loop)
        do
        {
            System.out.println("This is infinite do while loop.");
        } while(10 > 9);
*/

        // Scene 6. (DoWhile as a Menu List)
        int choice = '0';
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\nMenu: ");
            System.out.println("1. Pizza.");
            System.out.println("2. Pasta.");
            System.out.println("3. Burger.");
            System.out.println("4. Fanta.");
            System.out.println("5. EXIT.");
            try 
            {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }            
            switch(choice)
            {
                case 1 -> System.out.println("making pizza function call...");
                case 2 -> System.out.println("making pasta function call...");
                case 3 -> System.out.println("making burger function call...");
                case 4 -> System.out.println("making fanta function call...");
                case 5 -> {
                            System.out.println("Thank you! Visit Again");
                            System.exit(0);
                }
                default -> System.out.println("Sorry! Item not available....");
            }
        // } while(choice < 1 || choice > 5); // This will execute and ask order for only 1 time.
        } while(choice != 5); // This will execute until the customer wants to exit.
    }
}
