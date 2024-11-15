class SuperC
{
    int i;
    double d;
    SuperC()
    {
        d = i = 0;
    }
    SuperC(int i, double d)
    {
        this.i = i;
        this.d = d;
    }
    void displaySup()
    {
        System.out.println("i = " + i + " d = " + d);
    }
}

class SubC extends SuperC
{
    boolean val;
    SubC(int i, double d, boolean b)
    {
        this.i = i;
        this.d = d;
        val = b;
    }
    void displaySub()
    {
        System.out.println("val = " + val);
    }
}

class PRCO
{
    public static void main(String[] args)
    {
        SubC sub = new SubC(8, 9.02, true);
        // SuperC sup;
        // sup = sub; // --> made parent reference variable to point child's object. but parent cannot access child members.
        SuperC sup = new SubC(12, 137.02, true);

        System.out.println("Parent Values: with child object ");
        sub.displaySup();
        System.out.println("Child Values: with child object ");
        sub.displaySub();
        
        System.out.println("Parent Values: with parent object ");
        sup.displaySup();
        System.out.println("Child Values: with parent object is illegal in Java.");
        // sup.displaySub();
    }
}
