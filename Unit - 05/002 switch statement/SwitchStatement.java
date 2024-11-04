class SwitchStatement
{
    public static void main(String[] args)
    {
        // 1st Example. (Switch with break;)
        for(int i = 0; i < 5; i++)
        {
            switch(i)
            {
                case 1: System.out.println("i is one."); break;
                case 2: System.out.println("i is two."); break;
                case 3: System.out.println("i is three."); break;
                default: System.out.println("i is greater than 3.");
            }
        }

        // 2nd Example. (Switch without break;)
        for(int i = 0; i < 5; i++)
        {
            switch(i)
            {
                case 1: System.out.println("i is one.");
                case 2: System.out.println("i is two.");
                case 3: System.out.println("i is three.");
                default: System.out.println("i is greater than 3.\n");
            }
        }

        // 3rd Example. (Switch having multiple options)
        int month = 7; // July
        switch(month)
        {
            case 12:
            case 1:
            case 2: System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5: System.out.println("Spring"); break;
            case 6, 7, 8: System.out.println("Summer"); break;
            case 9, 10, 11: System.out.println("Autumn"); break;
            default: System.out.println("Bogus Month");
        }
    }
}
