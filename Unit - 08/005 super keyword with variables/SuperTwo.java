class A
{
    int i;
}

class B extends A
{
    int i;
    B(int num1, int num2)
    {
        super.i = num1;
        i = num2;
    }
    void i()
    {
        System.out.println("A's i = " + super.i + "\nB's i = " + i);
    }
}

class SuperTwo
{
    public static void main(String[] args)
    {
        B b = new B(12, 49);
        b.i();
    }
}
