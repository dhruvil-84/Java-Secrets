class BoolVar
{
    public static void main(String[] args)
    {
        boolean b;
        b = false;
        System.out.println("b is: " + b);
        b = true;
        System.out.println("b is: " + b + " now");
        if(b) System.out.println("This will be Executed.");
        b = false;
        if(b) System.out.println("This will not be Executed.");
        System.out.println("(10 > 9) is " + (10 > 9));
    }
}
