class MultByTwo
{
    public static void main(String[] args)
    {
        int num = 0xFFFFFFE;
        for(int i = 0; i < 5; i++)
        {
            num <<= 1; // num = num * power(2, 1)
            System.out.println(num);
            // Note that when 1 is reached at MSB i.e., 31 in case of int variable, the result becomes negative.
        }
    }
}
