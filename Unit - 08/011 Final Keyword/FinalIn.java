// in previous programs we saw use of final with variables.
// now we will se use of final with methods and classes.

class A
{
    final void print() // --> this cannot be overriden.
    {
        System.out.println("A class");
    }
}

final class B extends A // --> this cannot be inherited.
{
    void Bprint() // i have to change name of this func as i cannot override print();
    {
        System.out.println("B class");
    }
}

// class C extends B --> this is illegal coz B is final.

class FinalIn
{
    public static void main(String[] args)
    {
        B b = new B();
        b.print();
        b.Bprint();
    }
}
