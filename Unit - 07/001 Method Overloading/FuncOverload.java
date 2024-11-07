class FuncOverloadDemo
{
    void test()
    {
        System.out.println("This is test() function.");
    }
    //void test(int a)
    //{
    //    System.out.println("This is test(int a): " + a + ".");
    //}
    void test(double a)
    {
        System.out.println("This is test(double a): " + a + ".");
    }
    void test(int a, int b)
    {
        System.out.println("This is test(int a, int b): " + a + " " + b + ".");
    }
}

class FuncOverload
{
    public static void main(String[] args)
    {
        FuncOverloadDemo ob = new FuncOverloadDemo();
        ob.test();
        ob.test(12);
        ob.test(12.24);
        ob.test(12, 24);
    }
}
