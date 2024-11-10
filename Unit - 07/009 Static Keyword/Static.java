class StaticDemo
{
    static int a = 10;
    static double b = 12.24;
    static {
        a = 24;
    }
    static void show()
    {
        System.out.println("a = " + a);
    }
}

class Static
{
    public static void main(String[] args)
    {
        StaticDemo.show();
        System.out.println("b = " + StaticDemo.b);
    }
}
