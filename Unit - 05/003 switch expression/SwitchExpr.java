class SwitchExpr
{
    public static void main(String[] args)
    {
        // 1st Example. (Switch Expression with String as choice)
        String day = "saturday";
        int day_num;
        switch(day)
        {
            case "sunday" -> {
                                day_num = 1;
                                System.out.println("Sunday = " + day_num);
            }
            case "monday" -> {
                                day_num = 2;
                                System.out.println("Monday = " + day_num);
            }
            case "tuesday" -> {
                                day_num = 3;
                                System.out.println("Tuesday = " + day_num);
            }
            case "wednesday" -> {
                                day_num = 4;
                                System.out.println("Wednesday = " + day_num);
            }
            case "thursday" -> {
                                day_num = 5;
                                System.out.println("Thursday = " + day_num);
            }
            case "friday" -> {
                                day_num = 6;
                                System.out.println("Friday = " + day_num);
            }
            case "saturday" -> {
                                day_num = 7;
                                System.out.println("Saturday = " + day_num);
            }
            default -> System.out.println("Bogus Day.");
        }

        // 2nd Example. (Switch Expression having multiple options)
        int month = 7; // July
        switch(month)
        {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Bogus Month");
        }
    }
}
