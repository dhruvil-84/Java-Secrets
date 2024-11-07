class Box
{
    double width, height, depth;
    Box()
    {
        width = height = depth = -1;
    }
    Box(double s)
    {
        width = height = depth = s;
    }
    Box(double width, double depth, double height)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class ConOverload
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box(11);
        Box mybox3 = new Box(10, 20, 30);

        double vol1 = mybox1.volume();
        System.out.println("The volume of the box1 is: " + vol1);
        System.out.println("The volume of the box2 is: " + mybox2.volume());
        System.out.println("The volume of the box3 is: " + mybox3.volume());
    }
}
