class Final
{
    public static void main(String[] args)
    {
        final int a = 10;
        System.out.println(a);
        // a = 11; // Error: a is final so a is like constant.
        System.out.println(a);
    }
}
