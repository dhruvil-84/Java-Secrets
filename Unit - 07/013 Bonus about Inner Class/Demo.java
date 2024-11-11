class Outer 
{
    int outer_x = 100;
    void test() 
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner 
    {
        int y = 10; // y is local to Inner
        void display() 
        {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void showy() 
    {
        //Outer out = new Outer();
        //Outer.Inner in = out.new Inner();
        Inner in = new Inner();
        System.out.println(in.y); // error, y not known here!
    }
}

class Demo 
{
    public static void main(String args[]) 
    {
        Outer outer = new Outer();
        outer.test();
        outer.showy();
    }
}