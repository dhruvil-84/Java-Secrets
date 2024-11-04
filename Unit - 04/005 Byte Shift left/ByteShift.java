class ByteShift
{
    public static void main(String[] args)
    {
        byte a = 64, b;
        int c = a << 2; // c = a * power(2, 2);
        b = (byte) (a << 2);
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
    }
}
