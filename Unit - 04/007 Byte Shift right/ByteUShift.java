class ByteUShift
{
    public static void main(String[] args)
    {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte b = (byte) 0xF1; // 0xF1 = 1111 0001
        byte x = (byte) (b >> 4);
        byte y = (byte) (b >>> 4);
        byte z = (byte) ((b & 0xFF) >> 4);
        System.out.println("b = 0x" + hex[(b >> 4) & 0xF]  + hex[b & 0xf]);
        System.out.println("x = 0x" + hex[(x >> 4) & 0xF]  + hex[x & 0xf]);
        System.out.println("y = 0x" + hex[(y >> 4) & 0xF]  + hex[y & 0xf]);
        System.out.println("z = 0x" + hex[(z >> 4) & 0xF]  + hex[z & 0xf]);
    }
}
