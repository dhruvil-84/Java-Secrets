class Box
{
    int width, height, depth;
    Box(int width, int depth, int height)
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

class BoxDemo8
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box(10, 20, 30);
        Box mybox2 = new Box(10, 15, 20);
        // Box mybox3 = new Box(); // --> Error: because now there is no constructor with no arguments; i.e., there is no default constructor now as it is overwritten by parameterised constructor. (Solution is constructor Overloading)

        double vol1 = mybox1.volume();
        System.out.println("The volume of the box is: " + vol1);
        
        System.out.println("The volume of the box is: " + mybox2.volume());
    }
}
