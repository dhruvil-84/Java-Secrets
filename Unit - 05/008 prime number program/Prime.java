class Prime
{
    public static void main(String[] args)
    {
        int num = 97, flag = 0;
        if(num == 1) System.out.println("1 is neither prime nor coprime.");
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    System.out.println("NOT Prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println("Prime");
        }
    }
}
