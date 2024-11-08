// If Objects are passed as references then it is call by reference.
class CBRDemo
{
    int a, b;
    void swap(CBRDemo o)
    {
        int temp = o.a;
        o.a = o.b;
        o.b = temp;
    }
}

class CBR
{
    public static void main(String[] args)
    {
        CBRDemo ob = new CBRDemo();
        ob.a = 10;
        ob.b = 20;
        System.out.println("Before: " + ob.a + " " + ob.b);
        ob.swap(ob);
        System.out.println("After: " + ob.a + " " + ob.b);
    }
}
