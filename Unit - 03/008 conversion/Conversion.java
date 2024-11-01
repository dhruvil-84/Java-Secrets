class Conversion
{
    public static void main(String[] args)
    {
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i; // this is 257 % 128.
        System.out.println("Int to Byte: " + b);
        i = (int) d;
        System.out.println("Double to Int: " + i);
        b = (byte) d; // This is first converted to int so 323 % 128.
        System.out.println("Double to Byte: " + b);
    }
}
