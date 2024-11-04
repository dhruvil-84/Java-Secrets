class BitLogic
{
    public static void main(String[] args)
    {
        String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 3, b = 6;
        System.out.println("a | b = " + binary[a | b]);
        System.out.println("a & b = " + binary[a & b]);
        System.out.println("a ^ b = " + binary[a ^ b]);
        System.out.println("(~a & b) | (a & ~b) = " + binary[(~a & b) | (a & ~b)]);
        System.out.println("~a = " + binary[~a & 0xf]);
    }
}
