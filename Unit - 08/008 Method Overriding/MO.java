class P
{
    int i;
    P(int num)
    {
        i = num;
    }
    void show()
    {
        System.out.println("i = " + i);
    }
}

class C extends P
{
    int j;
    C(int num1, int num2)
    {
        super(num1);
        j = num2;
    }
    void show()
    {
        super.show();
        System.out.println("j = " + j);
    }
}

class MO
{
    public static void main(String[] args)
    {
        C child =  new C(12, 49);
        child.show();
    }
}
