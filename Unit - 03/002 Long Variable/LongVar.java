class LongVar
{
    public static void main(String[] args)
    {
        int lightspeed;
        long days, seconds, distance;
        lightspeed = 186000; // in miles per second.
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("In " + days + " days light will travel about " + distance + " miles.");
    }
}
