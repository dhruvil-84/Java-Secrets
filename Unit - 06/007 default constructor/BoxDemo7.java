class Box
{
    int width, height, depth;
    Box()
    {
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class BoxDemo7
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol1 = mybox1.volume();
        System.out.println("The volume of the box is: " + vol1);
        
        System.out.println("The volume of the box is: " + mybox2.volume());
    }
}
