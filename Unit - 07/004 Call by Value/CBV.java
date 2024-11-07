// If Primitive types are passed as arguments then it is call by value.
class CBVDemo
{
    void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}

class CBV
{
    public static void main(String[] args)
    {
        CBVDemo ob = new CBVDemo();
        int a = 10, b = 20;
        System.out.println("Before: " + a + " " + b);
        ob.swap(a, b);
        System.out.println("After: " + a + " " + b);
    }
}
