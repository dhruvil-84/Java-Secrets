class Promote
{
    public static void main(String[] args)
    {
        byte x = 50;
        // x = x * 2; // ERROR: x * 2 is int bcoz in an expression byte, short, char promotes to int. So, int cannot be assigned to byte variable.
        x = (byte) (x * 2);
        System.out.println("x = " + x);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f; // or float f = 5.67F; (lly, l or L for long and d or D for double)
        double d = .1234;

        //    double  =  float  +   int   -  double.
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
    }
}
