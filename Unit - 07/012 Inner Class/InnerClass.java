class Outer
{
    static int a = 10;
    int b = 20;
    private double d = 12.24;
    class Inner
    {
        void meth()
        {
            System.out.println("I am in Inner class & accessing: ");
            System.out.println("static int a = " + a);
            Outer temp = new Outer();
            System.out.println("int b = " + temp.b);
            System.out.println("private double d = " + temp.d);
        }
    }
}

class InnerClass
{
    public static void main(String[] args)
    {
        // Outer.Inner obj = new Outer.Inner(); // Error I have to  make a Outer object first.
        Outer out = new Outer();
        Outer.Inner obj = out.new Inner();
        obj.meth();
    }
}
