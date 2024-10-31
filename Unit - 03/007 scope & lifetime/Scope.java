class Scope
{
    public static void main(String[] args)
    {
        int x = 10;
        if(x == 10) {
            int y = 20;
            // int x = 20; // --> ERROR: compile time error, x is already defined.
            System.out.println("Inside Scope x = " + x);
            System.out.println("Inside Scope y = " + y);
        }
        System.out.println("Outside Scope x = " + x);
        // System.out.println("Outside Scope y = " + y); // --> ERROR: y not known here.

        // Lifetime of a variable is until the scope ends. in this when the for loop ends for any iteration the value of j becomes 0;
        for(int i = 0; i < 3; i++) {
            int j = -1;
            System.out.println("j = " + j);
            j = 100;
            System.out.println("j = " + j);
        }
    }
}
