class IntVar
{
    public static  void main(String[] args)
    {
        int a = 123_456_789;
        int b = 07; // this is in octal because there is a leading 0.
        int c = 017; // this is in octal because there is a leading 0.
        int d = 0266; // this is in octal because there is a leading 0.
        int e = 0x182; // this is in Hexadecimal.
        int f = 0x160; // this is in Hexadecimal.
        int g = 0b1010; // this is in Binary.
        int h = 0b11111; // this is in Binary.
        double i = 3E+8;
        double j = 1.82e-7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
