class Array
{
    public static void main(String[] args)
    {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double sum = 0;
        for(int _i = 0; _i < 5; _i++) sum += nums[_i];
        System.out.println("Average = " + sum / 5);
    }
}
