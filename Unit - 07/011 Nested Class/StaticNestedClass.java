// Nested class is Static
// Inner class are not static and there are two types of Inner classes; 1) Local Classes 2) Anonymous Inner Classes.

class Outer
{
    static int a = 10;
    private static int b = 20;
    double d = 12.24;
    static class NestedClass
    {
        void meth()
        {
            System.out.println("I am in Nested Class and accessing: ");
            System.out.println("static int a = " + a);
            System.out.println("private static int b = " + b);
            Outer temp = new Outer();
            System.out.println("double d = " + temp.d);
        }
    }
}

class StaticNestedClass
{
    public static void main(String[] args)
    {
        Outer.NestedClass obj = new Outer.NestedClass();
        obj.meth();
    }
}
