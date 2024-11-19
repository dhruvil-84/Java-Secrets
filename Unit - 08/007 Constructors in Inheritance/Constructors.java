class A
{
    A()
    {
        System.out.println("A's Constructor....");
    }
}

class B extends A
{
    B()
    {
        System.out.println("B's Constructor....");
    }
}

class C extends B
{
    C()
    {
        System.out.println("C's Constructor....");
    }
}

// After seeing the output we get to know that super() is implicitly called in a child constructor is super() / super(params) is not explicitly mentioned.
 
class Constructors
{
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println();
        B b = new B();
        System.out.println();
        A a = new A();
    }
}
