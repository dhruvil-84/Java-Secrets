class Parent
{
    int pa = 10;
    public int pb = 20;
    private int pc = 30;
    void display_parent()
    {
        System.out.println("pa = " + pa + "\npb = " + pb + "\npc = " + pc);
    }
}

class Child extends Parent
{
    int ca = 70;
    public int cb = 80;
    private int cc = 90;
    void display_child()
    {
        // System.out.println("pa = " + pa + "\npb = " + pb + "\npc = " + pc); // ERROR: pc is private and cannot be accessed here.
        System.out.println("ca = " + ca + "\ncb = " + cb + "\ncc = " + cc);
    }
}

class SingleIn
{
    public static void main(String[] args)
    {
        Parent P = new Parent();
        Child C = new Child();

        System.out.println("With Parent Object, I can access: ");
        System.out.println()
        P.display_parent();
        // P.display_child(); // --> Parent cannot Acces child members.

        System.out.println("With Child Object, I can access: ");
        C.display_parent(); // --> Child can access Parent members.
        C.display_child();
    }
}
