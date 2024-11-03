class IncDec
{
    public static void main(String[] args)
    {
        int a = 1, b = 2, c, d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = "  + a); 
        System.out.println("b = "  + b); 
        System.out.println("c = "  + c); 
        System.out.println("d = "  + d); 

        //int x = 8, y = 2;
        //int a = x++ + y-- - --x + --y - --y - --y + x++ + y++;
        //System.out.println(a);

        int x = 001, y=010, z=100;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
         
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
    }
}
